package edu.bupt.platform.IoT.job;

import java.util.Map;

import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.common.VerifyResult;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月23日 上午10:44:37
* @introduction:
*/

@Service
public class DBJob extends BaseJob {
	
	public Boolean SaveSignUpMessage(String mes) {
		
		//TODO 存储信息
		return true;
	}
	
	public Boolean VerifySignUpMessage(String mes) {
		return true;
	}
	
	public Boolean SaveSendedMessage(Map<String, String> hash) {
		return true;
	}
}
