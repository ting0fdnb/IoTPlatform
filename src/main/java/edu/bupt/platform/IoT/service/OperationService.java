package edu.bupt.platform.IoT.service;

import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.common.VerifyResult;

/**
 * @author:mc
 * @Email:983771387@qq.com
 * @version V1.0.0
 * @createTime：2017年8月11日 下午6:44:54
 */

@Service
public class OperationService extends BaseService {

	// 进行区块的信息验证
	public VerifyResult verifyMessage(String msg) {
		//TODO 完成信息验证
		return new VerifyResult(0, "", null);
	}

	// 将区块中信息在平台中保存
	public String saveMessage(VerifyResult mes) {
		//TODO 完成信息存储
		return "saveMessage success!";
	}

	//进行设备注册的信息验证
	public VerifyResult verifySignUpMessage(String signMessage) {
		// TODO 完成注册信息的验证
		return new VerifyResult(0, "", null);
	}

	//存储设备的注册信息
	public String saveSignUpMessage(VerifyResult ver) {
		// TODO 对设备注册信息进行本地数据库存储
		return "saveSignUpMessage success!";
	}

}
