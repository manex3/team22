package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.OrdersDTO;
import com.multi.frame.MyService;
import com.multi.mapper.OrdersMapper;

@Service
public class OrdersService implements MyService<Integer, OrdersDTO>{

	@Autowired
	OrdersMapper mapper;
	
	@Override
	public void register(OrdersDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrdersDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public OrdersDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrdersDTO> get() throws Exception {
		return mapper.selectall();
	}

}
