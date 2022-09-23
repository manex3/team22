package com.multi.wish;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.WishDTO;
import com.multi.service.CartService;
import com.multi.service.WishService;

@SpringBootTest
class GetAllWish {
	@Autowired
	WishService service;

	@Test
	void contextLoads() {
		List<WishDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (WishDTO c : list) {
			System.out.println(c);
		}
	}

}
