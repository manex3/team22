package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.OrdersDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface OrdersMapper extends MyMapper<Integer, OrdersDTO> {
	public List<OrdersDTO> ordersall(Integer order_id) throws Exception;

}
