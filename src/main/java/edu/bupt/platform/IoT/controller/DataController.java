package edu.bupt.platform.IoT.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.bupt.platform.IoT.common.Authority;
import edu.bupt.platform.IoT.common.IoTResult;
import edu.bupt.platform.IoT.common.VerifyResult;
import edu.bupt.platform.IoT.data.obj.Device;
import edu.bupt.platform.IoT.data.obj.HistoryInfo;
import edu.bupt.platform.IoT.data.obj.Statistics;
import edu.bupt.platform.IoT.service.AuthorityService;
import edu.bupt.platform.IoT.service.DisplayService;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年8月11日 下午6:13:23
*/

@RequestMapping("/data")
@RestController
public class DataController extends BaseController {
	
	@Resource
	AuthorityService authorityService;
	
	@Resource
	DisplayService displayService;
	
	/*
	 * show device info
	 */
	@RequestMapping({"/device/{id:\\d+}" })
	public IoTResult showDeviceInfo(RequestMapping request, @PathVariable Long id) {
		
		VerifyResult ver = authorityService.verifyAuthority(Authority.a1);
		if (ver.getCode() == 0) {
			Device detail = displayService.getDetailBydeviceId(id);
			return new IoTResult(0, "", detail);
		}
		return new IoTResult(1, "verify failed", null);
	}
	
	/*
	 * show history info
	 */
	@RequestMapping({"/history/{id:\\d+}" })
	public IoTResult showHistoryInfo(RequestMapping request, @PathVariable Long id) {
		
		VerifyResult ver = authorityService.verifyAuthority(Authority.a3);
		if (ver.getCode() == 0) {
			HistoryInfo history = displayService.getHistoryBydeviceId(id);
			return new IoTResult(0, "", history);
		}
		return new IoTResult(1, "verify failed", null);
	}
	
	/*
	 * show data statistics
	 */
	@RequestMapping("/statistics")
	public IoTResult showStatistics(RequestMapping request) {
		
		VerifyResult ver = authorityService.verifyAuthority(Authority.a3);
		if (ver.getCode() == 0) {
			Statistics sta = displayService.getStatistics();
			return new IoTResult(0, "", sta);
		}
		return new IoTResult(1, "verify failed", null);
	}
}
