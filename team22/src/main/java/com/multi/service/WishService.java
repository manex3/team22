package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.WishDTO;
import com.multi.frame.MyService;
import com.multi.mapper.WishMapper;

@Service
public class WishService implements MyService<String, WishDTO>{

	@Autowired
	WishMapper mapper;
	
	@Override
	public void register(WishDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(WishDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public WishDTO get(String k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<WishDTO> get() throws Exception {
		return mapper.selectall();
	}

}
