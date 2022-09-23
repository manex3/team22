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
		OrderDetailsDTO order_details = new OrderDetailsDTO(1234, 101, "abc", 10, null);
		try {
			service.register(order_details);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
