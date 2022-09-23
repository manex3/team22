package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



public class CustDTO {
	private String cust_id;
	private int wish_id;
	private String pwd;
	private String name;
	private String mobile;
	private String email;
	private String addr;
	private Date hdate;
	private String withdrawal;

	public CustDTO() {
	}

	public CustDTO(String cust_id, int wish_id, String pwd, String name, String mobile, String email, String addr,
			Date hdate, String withdrawal) {
		this.cust_id = cust_id;
		this.wish_id = wish_id;
		this.pwd = pwd;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.addr = addr;
		this.hdate = hdate;
		this.withdrawal = withdrawal;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public int getWish_id() {
		return wish_id;
	}

	public void setWish_id(int wish_id) {
		this.wish_id = wish_id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public Date getHdate() {
		return hdate;
	}

	public void setHdate(Date hdate) {
		this.hdate = hdate;
	}

	public String getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}

	@Override
	public String toString() {
		return "CustDTO [cust_id=" + cust_id + ", wish_id=" + wish_id + ", pwd=" + pwd + ", name=" + name + ", mobile="
				+ mobile + ", email=" + email + ", addr=" + addr + ", hdate=" + hdate + ", withdrawal=" + withdrawal
				+ "]";
	}

}
