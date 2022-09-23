package com.multi.wish;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CartService;
import com.multi.service.WishService;

@SpringBootTest
class DeleteWish {
	@Autowired
	WishService service;

	@Test
	void contextLoads() {
		try {
			service.remove(1234);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
