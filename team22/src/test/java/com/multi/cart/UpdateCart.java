package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class UpdateCart {
	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(1, "id02", 1, 1, null, 30000, "해리포터", "a.img");
		try {
			service.modify(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
