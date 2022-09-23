package com.multi.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class UpdateDelivery {
	@Autowired
	DeliveryService service;

	@Test
	void contextLoads() {
		DeliveryDTO delivery = new DeliveryDTO(1234, 101, "abc", 15, null);
		try {
			service.modify(delivery);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
