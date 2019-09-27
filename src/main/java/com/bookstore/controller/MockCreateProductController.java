package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bookstore.dto.CreateProductRequestDTO;
import com.bookstore.dto.CreateProductResponseDTO;
import com.bookstore.service.CreateProductService;

@CrossOrigin
@RestController
public class MockCreateProductController {

	@Autowired
	private CreateProductService createProductService;

	@PostMapping("/product/add")
	public CreateProductResponseDTO createProduct(@RequestParam("file") MultipartFile file,
			@RequestParam("categoryId") String categoryId, @RequestParam("name") String name,
			@RequestParam("unitPrice") String unitPrice, @RequestParam("description") String description) {

		final CreateProductRequestDTO requestDTO = new CreateProductRequestDTO();
		requestDTO.setFile(file);
		requestDTO.setName(name);
		requestDTO.setUnitPrice(unitPrice);
		requestDTO.setDescription(description);

		System.out.println(file);
		return createProductService.createProduct(requestDTO);
	}

}