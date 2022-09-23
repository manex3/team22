package com.multi.vo;

import java.util.Arrays;

public class CustVO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String[] addr;
	private String mobile;

	public CustVO() {
	}

	public CustVO(String id, String pwd, String name, String email, String[] addr, String mobile) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.mobile = mobile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getAddr() {
		return addr;
	}

	public void setAddr(String[] addr) {
		this.addr = addr;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "CustVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", addr="
				+ Arrays.toString(addr) + ", mobile=" + mobile + "]";
	}


}