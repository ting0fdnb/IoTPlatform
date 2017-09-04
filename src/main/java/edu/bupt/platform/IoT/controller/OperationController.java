package edu.bupt.platform.IoT.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bupt.platform.IoT.common.IoTResult;
import edu.bupt.platform.IoT.common.VerifyResult;
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

	/*
	 * send message
	 */
	@RequestMapping("/sendMessage")
	@ResponseBody
	public IoTResult sendMessage(HttpServletRequest request,
			@RequestParam(required = false, defaultValue = "") String message) {
		VerifyResult ver = operationService.verifyMessage(message);
		if (ver.getCode() == 0) {
			String save = operationService.saveMessage(ver);
			return new IoTResult(0, "", save);
		}
		return new IoTResult(1, "verify failed", null);
	}

	/*
	 * sign up
	 */
	@RequestMapping("/signUp")
	@ResponseBody
	public IoTResult signUp(HttpServletRequest request, @RequestParam(required = true) String deviceName,
			@RequestParam(required = true) String typeCode, @RequestParam(required = true) String manufacturer,
			@RequestParam(required = true) String deviceCode, @RequestParam(required = false) String description,
			@RequestParam(required = false) String picUrl, @RequestParam(required = false) String domain) {

		String signMessage = getSignMessage(deviceName, typeCode, manufacturer, deviceCode, description, picUrl, domain);
		VerifyResult ver = operationService.verifySignUpMessage(signMessage);
		
		if(ver.getCode() == 0) {
			String save = operationService.saveSignUpMessage(ver);
			return new IoTResult(0, "", save);
		}
		return new IoTResult(1, "verify failed", null);
	}
	
	private static String getSignMessage(String deviceName, String typeCode, String manufacturer, String deviceCode, String description, String picUrl, String domain){
		return deviceName + "&&" +  typeCode  + "&&" +  manufacturer  + "&&" +  deviceCode  + "&&" +  description  + "&&" +  picUrl  + "&&" +  domain;
	}
}
