package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.DeliveryDTO;
import com.multi.frame.MyService;
import com.multi.mapper.DeliveryMapper;

@Service
public class DeliveryService implements MyService<String, DeliveryDTO>{

	@Autowired
	DeliveryMapper mapper;
	
	@Override
	public void register(DeliveryDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(DeliveryDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public DeliveryDTO get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<DeliveryDTO> get() throws Exception {
		return mapper.selectall();
	}

}
