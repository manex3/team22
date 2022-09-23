package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.OrderDetailsDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface OrderDetailsMapper extends MyMapper<Integer, OrderDetailsDTO> {
	public List<OrderDetailsDTO> orderdetailall(Integer o_detail) throws Exception;
}

