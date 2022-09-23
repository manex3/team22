package com.multi.mapper;


import java.util.List;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.OrdersDTO;
import com.multi.frame.MyMapper;

public interface OrdersMapper extends MyMapper<Integer, OrdersDTO> {
	public List<OrdersDTO> ordersall(String order_id) throws Exception;

}
