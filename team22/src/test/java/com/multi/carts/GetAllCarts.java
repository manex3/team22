package com.multi.carts;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartsDTO;
import com.multi.dto.CustDTO;
import com.multi.service.CartsService;

@SpringBootTest
class GetAllCarts {

	@Autowired
	CartsService service;
	
	@Test
	void contextLoads() {
		List<CartsDTO> list = null;
		try {
			list = service.cartsall("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CartsDTO c:list) {
			System.out.println(c);
		}
		
	}

}




