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

import com.bookstore.model.Category;
import com.bookstore.service.CategoryService;

@CrossOrigin
@RestController
@RequestMapping(path = "/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// 1
	@GetMapping
	public List<Category> getAll() {
		return categoryService.getAll();
	}

	// 2
	@GetMapping(path = "/{id}")
	public Category get(@PathVariable("id") long id) {
		return categoryService.get(id);
	}

	// 3
	@PostMapping
	public Category save(@RequestBody Category category) {
		return categoryService.save(category);
	}

	// 4
	@PutMapping
	public Category update(@RequestBody Category category) {
		return categoryService.update(category);
	}

	// 5
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") long id) {
		categoryService.delete(id);
	}
}
