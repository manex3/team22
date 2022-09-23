package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrdersDTO;
import com.multi.service.OrdersService;

@SpringBootTest
class InsertOrders {
	@Autowired
	OrdersService service;

	@Test
	void contextLoads() {
		OrdersDTO orders = new OrdersDTO(1234, 101, "abc", 10, null);
		try {
			service.register(orders);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
