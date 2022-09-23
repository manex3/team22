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

public class OrdersDTO {
	private int order_id;
	private String cust_id;
	private String receiver;
	private String r_mobile;
	private String r_addr;
	private int t_count;
	private int t_price;
	private String payment;
	private Date o_date;
	private String o_status;

	public OrdersDTO() {
	}

	public OrdersDTO(int order_id, String cust_id, String receiver, String r_mobile, String r_addr, int t_count,
			int t_price, String payment, Date o_date, String o_status) {
		this.order_id = order_id;
		this.cust_id = cust_id;
		this.receiver = receiver;
		this.r_mobile = r_mobile;
		this.r_addr = r_addr;
		this.t_count = t_count;
		this.t_price = t_price;
		this.payment = payment;
		this.o_date = o_date;
		this.o_status = o_status;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getR_mobile() {
		return r_mobile;
	}

	public void setR_mobile(String r_mobile) {
		this.r_mobile = r_mobile;
	}

	public String getR_addr() {
		return r_addr;
	}

	public void setR_addr(String r_addr) {
		this.r_addr = r_addr;
	}

	public int getT_count() {
		return t_count;
	}

	public void setT_count(int t_count) {
		this.t_count = t_count;
	}

	public int getT_price() {
		return t_price;
	}

	public void setT_price(int t_price) {
		this.t_price = t_price;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public String getO_status() {
		return o_status;
	}

	public void setO_status(String o_status) {
		this.o_status = o_status;
	}

	@Override
	public String toString() {
		return "OrdersDTO [order_id=" + order_id + ", cust_id=" + cust_id + ", receiver=" + receiver + ", r_mobile="
				+ r_mobile + ", r_addr=" + r_addr + ", t_count=" + t_count + ", t_price=" + t_price + ", payment="
				+ payment + ", o_date=" + o_date + ", o_status=" + o_status + "]";
	}

}
