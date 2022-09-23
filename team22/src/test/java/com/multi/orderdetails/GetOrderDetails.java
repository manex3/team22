package com.multi.orderdetails;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderDetailsDTO;
import com.multi.service.OrderDetailsService;

@SpringBootTest
class GetOrderDetails {

	@Autowired
	OrderDetailsService service;
	
	@Test
	void contextLoads() {
		OrderDetailsDTO order_details = null;
		try {
			order_details = service.get(100);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(order_details);
	}

}




