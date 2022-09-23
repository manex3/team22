package com.multi.orders;

import java.util.Date;

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
		OrdersDTO orders = new OrdersDTO(10011, "id11", "김태연", "010-0309-1989", "전북", 3, 39900, "신용카드", null, "결제 전");
		try {
			service.register(orders);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
