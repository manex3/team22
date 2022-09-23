package com.multi.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.DeliveryService;

@SpringBootTest
class DeleteDelivery {
	@Autowired
	DeliveryService service;

	@Test
	void contextLoads() {
		try {
			service.remove("본가");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
