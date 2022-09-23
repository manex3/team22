package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.OrderDetailsDTO;
import com.multi.frame.MyService;
import com.multi.mapper.OrderDetailsMapper;

@Service
public class OrderDetailsService implements MyService<String, OrderDetailsDTO>{

	@Autowired
	OrderDetailsMapper mapper;
	
	@Override
	public void register(OrderDetailsDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(OrderDetailsDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public OrderDetailsDTO get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<OrderDetailsDTO> get() throws Exception {
		return mapper.selectall();
	}

}
