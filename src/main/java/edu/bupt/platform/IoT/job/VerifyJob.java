package edu.bupt.platform.IoT.job;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.api.BlockchainAPI;
import edu.bupt.platform.IoT.common.VerifyResult;
import edu.bupt.platform.IoT.common.util.HexTransformUtil;
import edu.bupt.platform.IoT.common.util.MessageHashUtil;
import edu.bupt.platform.IoT.data.mapper.AccessDeviceMapper;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月23日 上午11:04:59
* @introduction:
*/

@Service
public class VerifyJob extends BaseJob {

	@Autowired
	BlockchainAPI blockchainAPI;
	
	@Autowired
	DBJob dbJob;
	
	@Autowired
	AccessDeviceMapper accessDeviceMapper;
	
	public VerifyResult verifySendMessage(String sendMessage) {
		
		Map<String, String> hash = MessageHashUtil.getHash(sendMessage);
		String transactionHash = null;
		for(String key : hash.keySet()) {
			try {
				transactionHash = blockchainAPI.SendTransaction(HexTransformUtil.encode(key));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(transactionHash == null) {
			return new VerifyResult(1, "verify failed!", sendMessage);
		}
		
		//TODO 存储数据库
		if(!dbJob.SaveSendedMessage(hash)) {
			return new VerifyResult(1, "save message failed!", hash);
		}
		
		return new VerifyResult(0, "verify success!", null);
	}
	
	//TODO check the order
	public VerifyResult verifySignUpMessage(String signMessage) {
		String registerHash = "0x40228728e195ff239cb10260fd4f2ba36f2bc585e3a6758a8489b13d4e395c09";
		String hexString = null;
		try {
			hexString = blockchainAPI.getTransactionDateByHash(registerHash);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//从链里获得注册表
		String registerTable = HexTransformUtil.decode(hexString);
		
		if(!verifyRegister(signMessage, registerTable)) {
			return new VerifyResult(1, "verify failed!", signMessage);
		}
		
		return new VerifyResult(0, "verify success!", null);
		
		
//		String transactionHash = null;
//		try {
//			transactionHash = blockchainAPI.SendTransaction(signMessage);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(transactionHash == null) {
//			return new VerifyResult(1, "verify failed!", signMessage);
//		}
//		
//		//验证本地数据库
//		if(!dbJob.VerifySignUpMessage(signMessage)) {
//			return new VerifyResult(1, "verify failed!", signMessage);
//		}
//		
//		//TODO 存储数据库
//		
//		return new VerifyResult(0, "verify success!", null);
	}

	private boolean verifyRegister(String signMessage, String registerTable) {
		//TODO 新的逻辑
		
		String[] attrs = signMessage.split("&&");
		
		String deviceName = attrs[0];
		String typeCode = attrs[1];
		String manufacturer = attrs[2];
		String deviceCode = attrs[3];
		
		Integer count = accessDeviceMapper.existAccessRecord(deviceName, typeCode, manufacturer, deviceCode);
		
		return count > 0;
	}

}
