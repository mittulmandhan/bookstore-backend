package com.bookstore.dto;

import java.io.Serializable;
import java.util.Set;

import com.bookstore.model.User;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String jwttoken;
	private String email;
	private String name;
	private long userId;
	private Set<String> roles;

	public JwtResponse(User user, String jwttoken) {
		this.jwttoken = jwttoken;
		this.email = user.getEmail();
		this.name = user.getName();
		this.userId = user.getId();
		this.roles = user.getRoles();
	}
	
	
	

	public String getEmail() {
		return email;
	}




	public String getName() {
		return name;
	}




	public long getUserId() {
		return userId;
	}




	public Set<String> getRoles() {
		return roles;
	}




	public String getToken() {
		return this.jwttoken;
	}
	
	
	
}