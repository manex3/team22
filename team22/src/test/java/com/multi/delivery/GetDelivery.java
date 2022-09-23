package com.multi.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class GetDelivery {

	@Autowired
	DeliveryService service;
	
	@Test
	void contextLoads() {
		DeliveryDTO delivery = null;
		try {
			delivery = service.get(100);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(delivery);
	}

}




