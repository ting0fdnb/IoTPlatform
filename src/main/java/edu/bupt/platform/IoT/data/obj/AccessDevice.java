package edu.bupt.platform.IoT.data.obj;

import java.sql.Date;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月17日 下午9:34:48
* @introduction:
*/

public class AccessDevice {

	Integer id;
	
	String deviceName;
	
	String typeId;
	
	String company;
	
	String device_code;
	
	String description;
	
	String picUrl;
	
	String domain;
	
	Date registerTime;
	
	Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDevice_code() {
		return device_code;
	}

	public void setDevice_code(String device_code) {
		this.device_code = device_code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "AccessDevice [id=" + id + ", deviceName=" + deviceName + ", typeId=" + typeId + ", company=" + company
				+ ", device_code=" + device_code + ", description=" + description + ", picUrl=" + picUrl + ", domain="
				+ domain + ", registerTime=" + registerTime + ", updateTime=" + updateTime + "]";
	}
	
}
