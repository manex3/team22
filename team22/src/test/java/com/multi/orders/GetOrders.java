package com.multi.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrdersDTO;
import com.multi.service.OrdersService;

@SpringBootTest
class GetOrders {

	@Autowired
	OrdersService service;
	
	@Test
	void contextLoads() {
		OrdersDTO orders = null;
		try {
			orders = service.get(100);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(orders);
	}

}




