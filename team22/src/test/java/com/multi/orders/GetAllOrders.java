package com.multi.orders;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.OrdersDTO;
import com.multi.service.OrdersService;

@SpringBootTest
class GetAllOrders {
	@Autowired
	OrdersService service;

	@Test
	void contextLoads() {
		List<OrdersDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (OrdersDTO c : list) {
			System.out.println(c);
		}
	}

}
