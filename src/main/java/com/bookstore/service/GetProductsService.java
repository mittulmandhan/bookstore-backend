package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstore.dto.GetProductsResponseDTO;

@Service
public class GetProductsService {

	public List<GetProductsResponseDTO> getProducts() {
		
		List<GetProductsResponseDTO> list = new ArrayList<>();
		GetProductsResponseDTO responseDTO = new GetProductsResponseDTO();
		responseDTO.setProductId(1);
		responseDTO.setFile(null);
		responseDTO.setCategoryId("grossery");
		responseDTO.setName("bhindi");
		responseDTO.setUnitPrice("199");
		responseDTO.setDescription("bhindi pakoda");
		
		list.add(responseDTO);

		return list;

	}

}
