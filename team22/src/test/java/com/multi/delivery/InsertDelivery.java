package com.multi.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class InsertDelivery {
	@Autowired
	DeliveryService service;

	@Test
	void contextLoads() {
		DeliveryDTO delivery = new DeliveryDTO("집2",10008,"배송완료");
		try {
			service.register(delivery);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
