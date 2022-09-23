package com.multi.mapper;


import java.util.List;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.OrderDetailsDTO;
import com.multi.frame.MyMapper;

public interface OrderDetailsMapper extends MyMapper<Integer, OrderDetailsDTO> {
	public List<OrderDetailsDTO> orderdetailall(String o_detail) throws Exception;
}

