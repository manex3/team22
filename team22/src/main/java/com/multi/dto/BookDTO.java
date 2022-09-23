package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class BookDTO {
	private int book_id;
	private int cate_id;
	private String b_name;
	private int price;
	private int stock;
	private String state;
	private Date date;
	private int sales;
	private String book_img;

	public BookDTO() {
	}

	public BookDTO(int book_id, int cate_id, String b_name, int price, int stock, String state, Date date, int sales,
			String book_img) {
		this.book_id = book_id;
		this.cate_id = cate_id;
		this.b_name = b_name;
		this.price = price;
		this.stock = stock;
		this.state = state;
		this.date = date;
		this.sales = sales;
		this.book_img = book_img;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getCate_id() {
		return cate_id;
	}

	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getBook_img() {
		return book_img;
	}

	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}

	@Override
	public String toString() {
		return "BookDTO [book_id=" + book_id + ", cate_id=" + cate_id + ", b_name=" + b_name + ", price=" + price
				+ ", stock=" + stock + ", state=" + state + ", date=" + date + ", sales=" + sales + ", book_img="
				+ book_img + "]";
	}

}
