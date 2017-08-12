package edu.bupt.platform.IoT.common;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version V1.0.0 
* @createTime：2017年8月11日 下午6:31:02
*/

public class IoTResult {
	
	Integer errorCode;
	
	String errorMessage;
	
	Object resObject;
	
	

	public IoTResult() {
		super();
	}

	public IoTResult(Integer errorCode, String errorMessage, Object resObject) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.resObject = resObject;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getResObject() {
		return resObject;
	}

	public void setResObject(Object resObject) {
		this.resObject = resObject;
	}

	@Override
	public String toString() {
		return "IoTResult [errorCode=" + errorCode + ", errorMessage=" + errorMessage + ", resObject=" + resObject
				+ "]";
	}
	
	
}
