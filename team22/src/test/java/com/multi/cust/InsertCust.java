package com.multi.cust;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class InsertCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		CustDTO cust = new CustDTO("id01", 1, "pwd01","홍길동","010-1234-5678","a@gmail.com","서울",null,"N");
		try {
			service.register(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}






