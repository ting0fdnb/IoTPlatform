package edu.bupt.platform.IoT.common;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月17日 下午9:08:27
* @introduction:
*/

public enum Authority {

	a1(1, "query itself"),
	a2(2, "query all"),
	a3(3, "query history");
	
	private int id;
	private String name;
	
	private Authority(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getIndex() {
		return this.ordinal();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
