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
public class CartDTO {
	private int cart_id;
	private String cust_id;
	private int book_id;
	private int b_count;
	private Date date;	
	private int book_price;
	private String book_bname;
	private String book_img;
	
	
	public CartDTO() {
	}


	public CartDTO(int cart_id, String cust_id, int book_id, int b_count, Date date, int book_price, String book_bname,
			String book_img) {
		this.cart_id = cart_id;
		this.cust_id = cust_id;
		this.book_id = book_id;
		this.b_count = b_count;
		this.date = date;
		this.book_price = book_price;
		this.book_bname = book_bname;
		this.book_img = book_img;
	}


	public int getCart_id() {
		return cart_id;
	}


	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}


	public String getCust_id() {
		return cust_id;
	}


	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}


	public int getBook_id() {
		return book_id;
	}


	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}


	public int getB_count() {
		return b_count;
	}


	public void setB_count(int b_count) {
		this.b_count = b_count;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getBook_price() {
		return book_price;
	}


	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}


	public String getBook_bname() {
		return book_bname;
	}


	public void setBook_bname(String book_bname) {
		this.book_bname = book_bname;
	}


	public String getBook_img() {
		return book_img;
	}


	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}


	@Override
	public String toString() {
		return "CartDTO [cart_id=" + cart_id + ", cust_id=" + cust_id + ", book_id=" + book_id + ", b_count=" + b_count
				+ ", date=" + date + ", book_price=" + book_price + ", book_bname=" + book_bname + ", book_img="
				+ book_img + "]";
	}
	
	
	
}