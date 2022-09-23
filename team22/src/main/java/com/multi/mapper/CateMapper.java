package com.multi.mapper;

import java.util.List;

import com.multi.dto.BookDTO;
import com.multi.dto.CateDTO;
import com.multi.frame.MyMapper;

public interface CateMapper extends MyMapper<String, CateDTO> {
	public List<CateDTO> cateall(String cate_id) throws Exception;

}
