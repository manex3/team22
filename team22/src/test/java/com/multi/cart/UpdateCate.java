package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.CateDTO;
import com.multi.service.CateService;

@SpringBootTest
class UpdateCate {
	@Autowired
	CateService service;

	@Test
	void contextLoads() {
		CateDTO cart = new CateDTO(1234, 101, "abc", 15, null);
		try {
			service.modify(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
