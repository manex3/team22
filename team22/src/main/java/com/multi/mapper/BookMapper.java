package com.multi.mapper;

import java.util.List;

import com.multi.dto.BookDTO;
import com.multi.frame.MyMapper;

public interface BookMapper extends MyMapper<Integer, BookDTO>{
	public List<BookDTO> bookall(String book_id) throws Exception;

}
