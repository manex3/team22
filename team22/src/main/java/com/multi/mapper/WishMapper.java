package com.multi.mapper;


import java.util.List;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.WishDTO;
import com.multi.frame.MyMapper;

public interface WishMapper extends MyMapper<String, WishDTO> {
	public List<WishDTO> wishall(String wish_id) throws Exception;

}
