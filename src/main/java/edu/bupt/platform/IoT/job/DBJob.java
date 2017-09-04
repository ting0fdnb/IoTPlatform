package edu.bupt.platform.IoT.job;

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
	
	public Boolean SaveSignUpMessage(VerifyResult mes) {
		
		if(mes.getCode() != 0) {
			return false;
		}
		
		//TODO 存储信息
		return true;
	}
}
