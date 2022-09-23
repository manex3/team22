package com.multi.cart;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class InsertCart {
	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(1,"id01",1,1,null,30000,"해리포터","a.img");
		try {
			service.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
