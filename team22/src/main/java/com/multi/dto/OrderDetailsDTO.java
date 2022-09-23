package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class OrderDetailsDTO {

	private int o_detail;
	private int order_id;
	private int book_id;
	private int o_count;

	public OrderDetailsDTO() {
	}

	public OrderDetailsDTO(int o_detail, int order_id, int book_id, int o_count) {
		this.o_detail = o_detail;
		this.order_id = order_id;
		this.book_id = book_id;
		this.o_count = o_count;
	}

	public int getO_detail() {
		return o_detail;
	}

	public void setO_detail(int o_detail) {
		this.o_detail = o_detail;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getO_count() {
		return o_count;
	}

	public void setO_count(int o_count) {
		this.o_count = o_count;
	}

	@Override
	public String toString() {
		return "OrderDetailsDTO [o_detail=" + o_detail + ", order_id=" + order_id + ", book_id=" + book_id
				+ ", o_count=" + o_count + "]";
	}

}
