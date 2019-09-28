package com.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity(name = "transaction")
public class Transaction {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "status", length = 10)
	private String status;

	@Column(name = "patment_type", length = 10)
	private String paymentType;

	@Column(name = "cart_id")
	@OneToOne
	private Cart cart;

	@Column(name = "user_id")
	@OneToOne
	private User user;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "createdDate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdDate;

}
