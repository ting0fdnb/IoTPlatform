package edu.bupt.platform.IoT.data.obj;

import java.sql.Date;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年9月7日 上午12:23:01
* @introduction:
*/

public class Device {

	Integer id;
	
	String deviceName;
	
	String typeId;
	
	String company;
	
	String deviceCode;
	
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

	public String getDeviceCode() {
		return deviceCode;
	}

	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
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
		return "Device [id=" + id + ", deviceName=" + deviceName + ", typeId=" + typeId + ", company=" + company
				+ ", deviceCode=" + deviceCode + ", description=" + description + ", picUrl=" + picUrl + ", domain="
				+ domain + ", registerTime=" + registerTime + ", updateTime=" + updateTime + "]";
	}

}
