package com.multi.mapper;


import java.util.List;

import com.multi.dto.CustDTO;
import com.multi.dto.DeliveryDTO;
import com.multi.frame.MyMapper;

public interface DeliveryMapper extends MyMapper<String, DeliveryDTO> {
	public List<DeliveryDTO> deliveryall(String dest_id) throws Exception;
}
