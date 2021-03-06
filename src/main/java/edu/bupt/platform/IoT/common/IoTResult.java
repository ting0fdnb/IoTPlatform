package edu.bupt.platform.IoT.common;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年8月11日 下午6:31:02
* @introduction: 平台返回给前端的结果类型
*/

public class IoTResult {
	
	private int code;
	
	private String msg;
	
	private Object result;
	
	public IoTResult() {
		super();
	}

	public IoTResult(int code, String msg, Object result) {
		super();
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "IoTResult [code=" + code + ", msg=" + msg + ", result=" + result + "]";
	}

}
