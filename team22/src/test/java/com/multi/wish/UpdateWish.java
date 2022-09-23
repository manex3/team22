package com.multi.wish;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.WishDTO;
import com.multi.service.WishService;

@SpringBootTest
class UpdateWish {
	@Autowired
	WishService service;

	@Test
	void contextLoads() {
		WishDTO wish = new WishDTO(1234, 101, "abc", 15, null);
		try {
			service.modify(wish);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
