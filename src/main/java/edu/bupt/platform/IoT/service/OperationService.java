package edu.bupt.platform.IoT.service;

import org.springframework.stereotype.Service;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年8月11日 下午6:44:54
*/

@Service
public class OperationService extends BaseService {

	//进行区块的信息验证
	public Boolean verifyMessage() {
		return true;
	}

	//将区块中信息在平台中保存
	public String saveMessage() {
		return "saveMessage success!";
	}

}
