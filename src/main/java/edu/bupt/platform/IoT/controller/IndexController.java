package edu.bupt.platform.IoT.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
* @author:mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年7月23日 下午9:28:28
*/

@RestController
public class IndexController extends BaseController{

	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		logger.info("Hello World logger test");
		return "Hello World";
	}
	
	@RequestMapping("/json")
	public Map<String, Object> json() {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("result", "true");
		return res;
	}
}
