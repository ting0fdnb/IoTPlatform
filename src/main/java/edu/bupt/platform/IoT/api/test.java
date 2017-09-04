package edu.bupt.platform.IoT.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月23日 下午7:22:00
* @introduction:
*/

public class test {
	public static void main(String[] args) {
		String p = "/[ABCD]{2,3}[a-z0-9]+/";
		
		Matcher m = Pattern.compile(p).matcher("");
		String matchContent = m.replaceAll("").trim();
		System.out.println(matchContent);
	}
	
}
