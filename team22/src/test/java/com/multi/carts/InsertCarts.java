package com.multi.carts;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartsDTO;
import com.multi.dto.CustDTO;
import com.multi.service.CartsService;

@SpringBootTest
class InsertCarts {

	@Autowired
	CartsService service;
	
	@Test
	void contextLoads() {
		try {
			service.register(new CartsDTO(0, "id01", 101, 3, null, null, null, 0, null));
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}




