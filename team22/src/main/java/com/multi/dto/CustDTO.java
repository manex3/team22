package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustDTO {
	private String cust_id;
	private String pwd;
	private String name;
	private String email;
	private String addr;
	private String mobile;
	
	public CustDTO() {
	}

	public CustDTO(String cust_id, String pwd, String name, String email, String addr, String mobile) {
		this.cust_id = cust_id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.mobile = mobile;
	}

	public String getId() {
		return cust_id;
	}

	public void setId(String cust_id) {
		this.cust_id = cust_id;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
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
		return "CustDTO [cust_id=" + cust_id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", addr=" + addr
				+ ", mobile=" + mobile + "]";
	}

	
	
}






