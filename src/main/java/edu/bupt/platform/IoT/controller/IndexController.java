package edu.bupt.platform.IoT.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
* @author:mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年7月23日 下午9:28:28
*/

@Controller
public class IndexController extends BaseController{

	
	@RequestMapping("/")
	public String hello() {
		return "index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> json() {
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("result", "true");
		return res;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String index() {
		return "index";
	}
	
}
