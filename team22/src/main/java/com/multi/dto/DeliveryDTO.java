package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class DeliveryDTO {

	private String dest_id;
	private int order_id;
	private String d_status;

	public DeliveryDTO() {
	}

	public DeliveryDTO(String dest_id, int order_id, String d_status) {
		this.dest_id = dest_id;
		this.order_id = order_id;
		this.d_status = d_status;
	}

	public String getDest_id() {
		return dest_id;
	}

	public void setDest_id(String dest_id) {
		this.dest_id = dest_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getD_status() {
		return d_status;
	}

	public void setD_status(String d_status) {
		this.d_status = d_status;
	}

	@Override
	public String toString() {
		return "DeliveryDTO [dest_id=" + dest_id + ", order_id=" + order_id + ", d_status=" + d_status + "]";
	}

}
