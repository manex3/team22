package com.multi.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.BookDTO;
import com.multi.service.BookService;

@SpringBootTest
class GetBook {

	@Autowired
	BookService service;

	@Test
	void contextLoads() {
		BookDTO book = null;
		try {
			book = service.get(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(book);
	}

}
