package com.multi.orderdetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderDetailsDTO;
import com.multi.service.OrderDetailsService;

@SpringBootTest
class InsertOrderDetails {
	@Autowired
	OrderDetailsService service;

	@Test
	void contextLoads() {
		OrderDetailsDTO order_details = new OrderDetailsDTO(1000001, 10008, 1, 8);
		try {
			service.register(order_details);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
