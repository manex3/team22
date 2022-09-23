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

public class WishDTO {

	private int wish_id;
	private int book_id;

	public WishDTO() {
	}

	public WishDTO(int wish_id, int book_id) {
		this.wish_id = wish_id;
		this.book_id = book_id;
	}

	public int getWish_id() {
		return wish_id;
	}

	public void setWish_id(int wish_id) {
		this.wish_id = wish_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	@Override
	public String toString() {
		return "WishDTO [wish_id=" + wish_id + ", book_id=" + book_id + "]";
	}

}
