package com.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity(name = "order_item")
public class OrderItem {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "product_id")
	@OneToOne
	private Product productId;

	@Column(name = "unit_price")
	private int unitPrice;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "total")
	private int total;

	@Column(name = "order_id")
	@OneToOne
	private Order order;

}
