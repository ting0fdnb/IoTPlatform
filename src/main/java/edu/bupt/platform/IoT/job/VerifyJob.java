package edu.bupt.platform.IoT.job;

import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.common.VerifyResult;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月23日 上午11:04:59
* @introduction:
*/

@Service
public class VerifyJob extends BaseJob {

	public VerifyResult verifySignUpMessage(String signMessage) {
		// TODO Auto-generated method stub
		
		return new VerifyResult(0, "verify success!", null);
	}

}
