package edu.bupt.platform.IoT.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import edu.bupt.platform.IoT.common.IoTResult;
import edu.bupt.platform.IoT.common.VerifyResult;
import edu.bupt.platform.IoT.data.obj.Device;
import edu.bupt.platform.IoT.service.AuthorityService;
import edu.bupt.platform.IoT.service.OperationService;

/**
 * @author: mc
 * @Email:983771387@qq.com
 * @version V1.0.0
 * @createTime：2017年8月11日 下午6:13:50
 */

@RequestMapping("/operate")
@Controller
public class OperationController extends BaseController {

	@Autowired
	OperationService operationService;
	
	@Resource
	AuthorityService authorityService;

	/*
	 * send message
	 */
	@RequestMapping("/sendMessage")
	@ResponseBody
	public IoTResult sendMessage(HttpServletRequest request,
			@RequestParam(required = false, defaultValue = "") String message) {
		VerifyResult ver = operationService.verifyMessage(message);
		if (ver.getCode() != 0) {
			return new IoTResult(1, "verify failed", message);
		}
		return new IoTResult(0, "", null);
	}

	/*
	 * sign up
	 */
	@RequestMapping(value="/signUp", method = RequestMethod.GET)
	public String signUp() {
		return "register";
	}
	
	@RequestMapping(value="/signUp", method = RequestMethod.POST)
	public String signUp(Model model, HttpServletRequest request, @RequestParam(required = true) String deviceName,
			@RequestParam(required = true) String typeCode, @RequestParam(required = true) String manufacturer,
			@RequestParam(required = true) String deviceCode, @RequestParam(required = false) String description,
			@RequestParam(required = false) String picUrl, @RequestParam(required = false) String domain) {

		String signMessage = getSignMessage(deviceName, typeCode, manufacturer, deviceCode, description, picUrl, domain);
		VerifyResult ver = operationService.verifySignUpMessage(signMessage);
		
		if(ver.getCode() != 0) {
			return "registerFailed";
//			return new IoTResult(1, "verify failed", null);
		}
		
		String save = operationService.saveSignUpMessage(ver);
		
		model.addAttribute("deviceName", deviceName);
		model.addAttribute("typeCode", typeCode);
		model.addAttribute("manufacturer", manufacturer);
		model.addAttribute("deviceCode", deviceCode);
		model.addAttribute("description", description);
		model.addAttribute("picUrl", picUrl);
		model.addAttribute("domain", domain);
		
		
		return "deviceDetail";
//		return new IoTResult(0, "", save);
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest request, @RequestParam(required = true) String deviceName,
			@RequestParam(required = true) String deviceCode) {

		VerifyResult ver = operationService.verifyLoginMessage(deviceName, deviceCode);
		
		if(ver.getCode() != 0) {
			return "loginFailed";
//			return new IoTResult(1, "verify failed", null);
		}
		
		Device device = (Device)ver.getResult();
		
		model.addAttribute("deviceName", deviceName);
		model.addAttribute("deviceCode", deviceCode);
		
		model.addAttribute("typeCode", device.getTypeId());
		model.addAttribute("manufacturer", device.getCompany());
		model.addAttribute("description", device.getDescription());
		model.addAttribute("picUrl", device.getPicUrl());
		model.addAttribute("domain", device.getDomain());
		
		return "deviceDetail";
//		return new IoTResult(0, "", save);
	}
	
	@RequestMapping(value="/getData", method = RequestMethod.POST)
	public String getData(Model model, HttpServletRequest request, @RequestParam(required = true) String deviceName,
			@RequestParam(required = true) String targetDevice, @RequestParam(required = true) String dataLevel) {
		
		VerifyResult ver = authorityService.verifyAuthority(deviceName, targetDevice, dataLevel);
//		
//		if(ver.getCode() != 0) {
//			return new IoTResult(1, "authority not enough", null);
//		}
//		
//		Device deviceInfo = displayService.getDetailBydeviceId(Long.valueOf(id));
//		
//		return new IoTResult(0, "", deviceInfo);
		return "dataInfo";
	}
	
	private static String getSignMessage(String deviceName, String typeCode, String manufacturer, String deviceCode, String description, String picUrl, String domain){
		return deviceName + "&&" +  typeCode  + "&&" +  manufacturer  + "&&" +  deviceCode  + "&&" +  description  + "&&" +  picUrl  + "&&" +  domain;
	}
}
