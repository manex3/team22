package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class CateDTO {
	private int cate_id;
	private int top_id;
	private String c_name;

	public CateDTO() {
	}

	public CateDTO(int cate_id, int top_id, String c_name) {
		this.cate_id = cate_id;
		this.top_id = top_id;
		this.c_name = c_name;
	}

	public int getCate_id() {
		return cate_id;
	}

	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}

	public int getTop_id() {
		return top_id;
	}

	public void setTop_id(int top_id) {
		this.top_id = top_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	@Override
	public String toString() {
		return "CateDTO [cate_id=" + cate_id + ", top_id=" + top_id + ", c_name=" + c_name + "]";
	}

}
