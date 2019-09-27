package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.GetProductsResponseDTO;
import com.bookstore.service.GetProductsService;

@CrossOrigin
@RestController
public class MockGetProductsController {
	@Autowired
	private GetProductsService getProductsService;

	@GetMapping("/product/getall")
	public List<GetProductsResponseDTO> getProducts() {
		return getProductsService.getProducts();
	}
}
