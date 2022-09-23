package com.multi.orderdetails;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.OrderDetailsDTO;
import com.multi.service.OrderDetailsService;

@SpringBootTest
class GetAllOrderDetails {
	@Autowired
	OrderDetailsService service;

	@Test
	void contextLoads() {
		List<OrderDetailsDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (OrderDetailsDTO c : list) {
			System.out.println(c);
		}
	}

}
