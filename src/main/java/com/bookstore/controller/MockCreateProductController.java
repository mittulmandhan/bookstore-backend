package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bookstore.dto.CreateProductResponseDTO;
import com.bookstore.service.CreateProductService;

@CrossOrigin
@RestController
public class MockCreateProductController {

	@Autowired 
	private CreateProductService createProductService;
	
	@PostMapping(path = "/product/add")
	public CreateProductResponseDTO createProduct(@RequestParam("file") MultipartFile file, @RequestParam("categoryId") String categoryId) {
		System.out.println(file);
		return null;
				//createProductService.createProduct(requestDTO);
	}
}
