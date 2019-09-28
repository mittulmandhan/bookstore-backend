package com.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity(name = "order")
public class Order {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "customer_name", length = 50)
	private String customerName;

	@Column(name = "shipping_address", length = 500)
	private String shippingAddress;

	@Column(name = "contact_no", length = 10)
	private String ContactNo;

	@Column(name = "cart_id")
	@OneToOne
	private Cart cart;

	@Column(name = "user_id")
	@OneToOne
	private User user;

	@Column(name = "status", length = 10)
	private String status;

	@Column(name = "total")
	private Double total;

	@Column(name = "createdDate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdDate;
}
