package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.model.Product;
import com.bookstore.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;

	public List<Product> getAll() {
		return (List<Product>) productRepo.findAll();
	}

	public Product get(long id) {
		return productRepo.findById(id).get();
	}

	public Product save(Product product) {
		return productRepo.save(product);
	}

	public Product update(Product product) {
		Product existingProduct = productRepo.findById(product.getId()).get();
		if(existingProduct==null){
			throw new RuntimeException("Invalid product id");
		}
		existingProduct.setName(product.getName());
		existingProduct.setUnitPrice(product.getUnitPrice());
		existingProduct.setCategory(product.getCategory());
		return productRepo.save(existingProduct);
	}

	public void delete(long id) {
		productRepo.deleteById(id);
	}

}
