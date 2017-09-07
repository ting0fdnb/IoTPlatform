package edu.bupt.platform.IoT.data.obj;

import java.sql.Date;

public class AuthorityObj {

	Integer id;
	
	Integer groupId;
	
	String objectIds;
	
	Date registerTime;
	
	Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getObjectIds() {
		return objectIds;
	}

	public void setObjectIds(String objectIds) {
		this.objectIds = objectIds;
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
		return "AuthorityObj [id=" + id + ", groupId=" + groupId + ", objectIds=" + objectIds + ", registerTime="
				+ registerTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
