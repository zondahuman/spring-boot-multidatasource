package com.abin.lee.spring.boot.multids.api.po;

/**
 * @author leepon1990
 */
public class TChinaCity {

	private Integer id;
	// 城市名
	private String sname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname == null ? null : sname.trim();
	}


}