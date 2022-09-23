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
public class CartsDTO {
	private int id;
	private String cust_id;
	private int item_id;
	private int cnt;
	private Date rdate;
	
	private String cust_name;
	private String item_name;
	private int item_price;
	private String item_imgname;
	
	public CartsDTO() {
	}

	public CartsDTO(int id, String cust_id, int item_id, int cnt, Date rdate, String cust_name, String item_name,
			int item_price, String item_imgname) {
		this.id = id;
		this.cust_id = cust_id;
		this.item_id = item_id;
		this.cnt = cnt;
		this.rdate = rdate;
		this.cust_name = cust_name;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_imgname = item_imgname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_price() {
		return item_price;
	}

	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}

	public String getItem_imgname() {
		return item_imgname;
	}

	public void setItem_imgname(String item_imgname) {
		this.item_imgname = item_imgname;
	}

	@Override
	public String toString() {
		return "CartsDTO [id=" + id + ", cust_id=" + cust_id + ", item_id=" + item_id + ", cnt=" + cnt + ", rdate="
				+ rdate + ", cust_name=" + cust_name + ", item_name=" + item_name + ", item_price=" + item_price
				+ ", item_imgname=" + item_imgname + "]";
	}
	
	
	
}












