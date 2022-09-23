package com.multi.cate;

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
		CateDTO cart = new CateDTO(21,20,"외국잡지");
		try {
			service.modify(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
