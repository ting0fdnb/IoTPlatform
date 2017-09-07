package edu.bupt.platform.IoT.data.obj;

import java.sql.Date;

public class Authority {

	Integer id;
	
	String operateType;
	
	String operateObject;
	
	String dataLevel;
	
	Date registerTime;
	
	Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperateObject() {
		return operateObject;
	}

	public void setOperateObject(String operateObject) {
		this.operateObject = operateObject;
	}

	public String getDataLevel() {
		return dataLevel;
	}

	public void setDataLevel(String dataLevel) {
		this.dataLevel = dataLevel;
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
		return "Authority [id=" + id + ", operateType=" + operateType + ", operateObject=" + operateObject
				+ ", dataLevel=" + dataLevel + ", registerTime=" + registerTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
