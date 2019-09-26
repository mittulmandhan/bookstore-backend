package com.bookstore.dto;

import java.util.List;

public class LoginResponseDTO {

	private int UserId;
	private String Username;
	private String ContactNo;
	private String Address;
	private String Name;
	private String Token;
	private List<String> Roles;

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	public List<String> getRoles() {
		return Roles;
	}

	public void setRoles(List<String> roles) {
		Roles = roles;
	}

}
