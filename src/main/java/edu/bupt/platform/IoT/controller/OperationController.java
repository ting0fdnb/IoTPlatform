package edu.bupt.platform.IoT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bupt.platform.IoT.common.IoTResult;
import edu.bupt.platform.IoT.service.OperationService;

/**
* @author: mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年8月11日 下午6:13:50
*/
@RequestMapping("/operate")
@RestController
public class OperationController extends BaseController {
	
	@Autowired
	OperationService operationService;
	
	@RequestMapping("/sendMessage")
	@ResponseBody
	public IoTResult sendMessage() {
		String resMessage = "verify message sccess";
		
		Boolean ver = operationService.verifyMessage();
		
		if(ver) {
			String save = operationService.saveMessage();
			return new IoTResult(0,"", save);
		}
		
		
		return new IoTResult(1,"verify failed", null);
	}
	
	
}
