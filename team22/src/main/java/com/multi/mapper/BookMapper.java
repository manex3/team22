package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.BookDTO;
import com.multi.frame.MyMapper;


@Repository
@Mapper
public interface BookMapper extends MyMapper<Integer, BookDTO>{
	public List<BookDTO> bookall(Integer book_id) throws Exception;

}
