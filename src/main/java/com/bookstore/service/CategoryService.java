package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.Category;
import com.bookstore.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;

	public List<Category> getAll() {
		return (List<Category>) categoryRepo.findAll();
	}

	public Category get(long id) {
		return categoryRepo.findById(id).get();
	}

	public Category save(Category category) {
		return categoryRepo.save(category);
	}

	public Category update(Category category) {
		Category existingCategory = categoryRepo.findById(category.getId()).get();
		if(existingCategory==null){
			throw new RuntimeException("Invalid category id ");
		}
		existingCategory.setName(category.getName());
		existingCategory.setDescription(category.getDescription());
		return categoryRepo.save(existingCategory);
	}

	public void delete(long id) {
		categoryRepo.deleteById(id);
	}

}
