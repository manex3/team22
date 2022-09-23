package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.BookDTO;
import com.multi.frame.MyService;
import com.multi.mapper.BookMapper;

@Service
public class BookService implements MyService<Integer, BookDTO>{

	@Autowired
	BookMapper mapper;
	
	@Override
	public void register(BookDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(BookDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public BookDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<BookDTO> get() throws Exception {
		return mapper.selectall();
	}

}
