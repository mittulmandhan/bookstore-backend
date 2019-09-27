package com.bookstore.service;

import org.springframework.stereotype.Service;

import com.bookstore.dto.CreateProductRequestDTO;
import com.bookstore.dto.CreateProductResponseDTO;

@Service
public class CreateProductService {

	public CreateProductResponseDTO createProduct(CreateProductRequestDTO requestDTO) {
		CreateProductResponseDTO responseDTO = new CreateProductResponseDTO();
		responseDTO.setProductId(1);
//		responseDTO.setCategoryId(requestDTO.getCategoryId());
//		responseDTO.setName(requestDTO.getName());
//		responseDTO.setDescription(requestDTO.getDescription());
//		responseDTO.setUnitPrice(requestDTO.getUnitPrice());
//		responseDTO.setFile(requestDTO.getFile());
		return responseDTO;
	}

}
