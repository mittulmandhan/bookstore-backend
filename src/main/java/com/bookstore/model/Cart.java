package com.bookstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity(name="cart")
public class Cart {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "cart_name", length = 50)
	private String cartName;

	@Column(name = "total")
	private Double total;
	
	@Column(name = "createdDate", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdDate;
	
	@Column(name = "user_id")
	@OneToOne
	private User user;
}
//userId: { type: ObjectId, ref: 'users',required: true }, //relation
