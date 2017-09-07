package edu.bupt.platform.IoT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.common.VerifyResult;
import edu.bupt.platform.IoT.job.DBJob;
import edu.bupt.platform.IoT.job.VerifyJob;

/**
 * @author:mc
 * @Email:983771387@qq.com
 * @version V1.0.0
 * @createTime：2017年8月11日 下午6:44:54
 */

@Service
public class OperationService extends BaseService {

	@Autowired
	DBJob dbJob;
	
	@Autowired
	VerifyJob verifyJob;
	
	// 进行区块的信息验证
	public VerifyResult verifyMessage(String msg) {
		
		VerifyResult vr = verifyJob.verifySendMessage(msg);
				
		if(vr.getCode() != 0) {
			return new VerifyResult(1, "验证失败", msg);
		}
		
		return new VerifyResult(0, "", msg);
	}
	

//	// 将区块中信息在平台中保存
//	public String saveMessage(VerifyResult mes) {
//		//TODO 完成信息存储
//		if(dbJob.SaveSignUpMessage(mes)) {
//			return "saveMessage success!";
//		}
//		return "saveMessage failed!";
//	}

	//进行设备注册的信息验证
	public VerifyResult verifySignUpMessage(String signMessage) {
		
		//进行验证操作的节点共识，并触发其他节点进行本地验证
		VerifyResult vr = verifyJob.verifySignUpMessage(signMessage);
	
		if(vr.getCode() != 0) {
			return new VerifyResult(1, "验证失败", signMessage);
		}
		
		return new VerifyResult(0, "", signMessage);
	}
	
	//进行设备注册的信息验证
	public VerifyResult verifyLoginMessage(String deviceName, String deviceCode) {
		
		//进行验证操作的节点共识，并触发其他节点进行本地验证
		VerifyResult vr = verifyJob.verifyLoginMessage(deviceName, deviceCode);
	
		if(vr.getCode() != 0) {
			return new VerifyResult(1, "验证失败", deviceName);
		}
		
		return vr;
	}

	//存储设备的注册信息
	public String saveSignUpMessage(VerifyResult ver) {
		
		//TODO 存储数据库
		if(!dbJob.SaveSignUpMessage(ver.getResult().toString())) {
			return "saveSignUpMessage failed";
		}
		
		return "saveSignUpMessage success!";
	}

}
