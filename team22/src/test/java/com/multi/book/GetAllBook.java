package com.multi.book;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.BookDTO;
import com.multi.service.BookService;

@SpringBootTest
class GetAllBook {

	@Autowired
	BookService service;

	@Test
	void contextLoads() {
		List<BookDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (BookDTO c : list) {
			System.out.println(c);
		}

	}

}
