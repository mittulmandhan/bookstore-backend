package com.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity(name = "cart_item")
public class CartItem {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "product_id")
	@OneToOne
	private Product product;

	@Column(name = "cart")
	@OneToOne
	private Cart cart;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "total")
	private Double total;

	@Column(name = "unit_price")
	private Double unitPrice;

	@Column(name = "createdDate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdDate;
}