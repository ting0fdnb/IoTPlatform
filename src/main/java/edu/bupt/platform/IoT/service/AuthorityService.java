package edu.bupt.platform.IoT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.common.VerifyResult;
import edu.bupt.platform.IoT.job.VerifyJob;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月17日 下午9:06:57
* @introduction:
*/

@Service
public class AuthorityService extends BaseService {

	@Autowired
	VerifyJob verifyJob;
	
	
	/*
	 * verify authority
	 */
	public VerifyResult verifyAuthority(String deviceName, String targetDevice, String dataLevel) {
		
		
		
		//进行验证操作的节点共识，并触发其他节点进行本地验证
		VerifyResult vr = verifyJob.verifyAuthority(deviceName, targetDevice, dataLevel);
	
		if(vr.getCode() != 0) {
			return new VerifyResult(1, "权限等级不够", deviceName);
		}
		
		return new VerifyResult(0, "", deviceName);
	}
	
}
