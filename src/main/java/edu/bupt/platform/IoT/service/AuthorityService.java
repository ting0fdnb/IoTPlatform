package edu.bupt.platform.IoT.service;

import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.common.Authority;
import edu.bupt.platform.IoT.common.VerifyResult;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月17日 下午9:06:57
* @introduction:
*/

@Service
public class AuthorityService extends BaseService {

	/*
	 * verify authority
	 */
	public VerifyResult verifyAuthority(Authority a1) {
		// TODO Auto-generated method stub
		return new VerifyResult(1, "", null);
	}
	
}
