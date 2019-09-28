package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
