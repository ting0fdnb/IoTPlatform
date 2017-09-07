package edu.bupt.platform.IoT.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.bupt.platform.IoT.common.IoTResult;
import edu.bupt.platform.IoT.common.VerifyResult;
import edu.bupt.platform.IoT.data.mapper.DeviceAuthorityMapper;
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
	
	@Autowired
	DeviceAuthorityMapper deviceAuthorityMapper;
	
	/*
	 * show device info
	 */
//	@RequestMapping({"/device/{id:\\d+}" })
//	@ResponseBody
//	public IoTResult showDeviceInfo(HttpServletRequest request, @PathVariable("id") Integer id,
//			@RequestParam(required=false, defaultValue="1") String operateType,
//			@RequestParam(required=false, defaultValue="1") String dataLevel) {
//		
//		VerifyResult ver = authorityService.verifyAuthority(id, operateType, dataLevel);
//		
//		if(ver.getCode() != 0) {
//			return new IoTResult(1, "authority not enough", null);
//		}
//		
//		Device deviceInfo = displayService.getDetailBydeviceId(Long.valueOf(id));
//		
//		return new IoTResult(0, "", deviceInfo);
//	}
	
//	/*
//	 * show history info
//	 */
//	@RequestMapping({"/history/{id:\\d+}" })
//	public IoTResult showHistoryInfo(RequestMapping request, @PathVariable Integer id) {
//		
//		VerifyResult ver = authorityService.verifyAuthority(id);
//		if (ver.getCode() == 0) {
//			HistoryInfo history = displayService.getHistoryBydeviceId(id);
//			return new IoTResult(0, "", history);
//		}
//		return new IoTResult(1, "verify failed", null);
//	}
//	
//	/*
//	 * show data statistics
//	 */
//	@RequestMapping("/statistics")
//	public IoTResult showStatistics(RequestMapping request, @PathVariable Integer id) {
//		
//		VerifyResult ver = authorityService.verifyAuthority(id);
//		if (ver.getCode() == 0) {
//			Statistics sta = displayService.getStatistics();
//			return new IoTResult(0, "", sta);
//		}
//		return new IoTResult(1, "verify failed", null);
//	}
}
