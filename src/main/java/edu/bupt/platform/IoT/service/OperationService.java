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
		//TODO 完成信息验证
		return new VerifyResult(0, "", null);
	}
	

	// 将区块中信息在平台中保存
	public String saveMessage(VerifyResult mes) {
		//TODO 完成信息存储
		if(dbJob.SaveSignUpMessage(mes)) {
			return "saveMessage success!";
		}
		return "saveMessage failed!";
	}

	//进行设备注册的信息验证
	public VerifyResult verifySignUpMessage(String signMessage) {
		// TODO 完成注册信息的验证
		
		//进行本地数据库验证
		
		
		
		//进行验证操作的节点共识，并触发其他节点进行本地验证
		VerifyResult vr = verifyJob.verifySignUpMessage(signMessage);
		
		
		//收集其他节点的共识结果，并且统计验证结果
		if(vr.getCode() == 0 && true) {
			return new VerifyResult(0, "", null);
		}
		
		return new VerifyResult(1, "验证失败", null);
	}

	//存储设备的注册信息
	public String saveSignUpMessage(VerifyResult ver) {
		// TODO 对设备注册信息进行本地数据库存储
		return "saveSignUpMessage success!";
	}

}
