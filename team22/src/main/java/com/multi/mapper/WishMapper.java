package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.WishDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface WishMapper extends MyMapper<Integer, WishDTO> {
	public List<WishDTO> wishall(Integer wish_id) throws Exception;

}
