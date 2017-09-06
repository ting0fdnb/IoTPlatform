package edu.bupt.platform.IoT.common.util;

import java.util.HashMap;
import java.util.Map;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年9月4日 下午5:05:14
* @introduction:
*/

public class MessageHashUtil {

	public static Map<String, String> getHash(String msg){
		HashMap<String, String> result = new HashMap<String, String>();
		//TODO 
		result.put(msg, msg);
		return result;
	}
}
