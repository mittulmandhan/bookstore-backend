package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.model.Product;
import com.bookstore.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping(path = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	// 1
	@GetMapping
	public List<Product> getAll() {
		return productService.getAll();
	}

	// 2
	@GetMapping(path = "/{id}")
	public Product get(@PathVariable("id") long id) {
		return productService.get(id);
	}

	// 3
	@PostMapping
	public Product save(@RequestBody Product category) {
		return productService.save(category);
	}

	// 4
	@PutMapping
	public Product update(@RequestBody Product category) {
		return productService.update(category);
	}

	// 5
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") long id) {
		productService.delete(id);
	}
}
