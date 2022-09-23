package com.multi.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.BookService;

@SpringBootTest
class DeleteBook {
	@Autowired
	BookService service;

	@Test
	void contextLoads() {
		try {
			service.remove(1234);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
