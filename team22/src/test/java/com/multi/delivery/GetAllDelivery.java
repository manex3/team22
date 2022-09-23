package com.multi.delivery;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class GetAllDelivery {
	@Autowired
	DeliveryService service;

	@Test
	void contextLoads() {
		List<DeliveryDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (DeliveryDTO c : list) {
			System.out.println(c);
		}
	}

}
