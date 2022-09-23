package com.multi.orderdetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.OrderDetailsService;

@SpringBootTest
class DeleteOrderDetails {
	@Autowired
	OrderDetailsService service;

	@Test
	void contextLoads() {
		try {
			service.remove(1234);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
