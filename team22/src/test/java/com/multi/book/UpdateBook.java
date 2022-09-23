package com.multi.book;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.BookDTO;
import com.multi.dto.CartDTO;
import com.multi.service.BookService;

@SpringBootTest
class UpdateBook {
	@Autowired
	BookService service;

	@Test
	void contextLoads() {
		BookDTO book = new BookDTO(0, 10, "해리포터", 20000, 1, "판매중",null, 5, "h.jpg");
		try {
			service.modify(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
