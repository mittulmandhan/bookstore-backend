package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.LoginRequestDTO;
import com.bookstore.dto.LoginResponseDTO;
import com.bookstore.service.LoginService;


@CrossOrigin
@RestController
public class MockLoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping(path = "/login")
	public LoginResponseDTO authenticateUser(@RequestBody LoginRequestDTO requestDTO) {
		System.out.println(requestDTO.getUsername() + " , " + requestDTO.getPassword());
		return loginService.authenticateUser(requestDTO);
	}

}

// ctrl+shift +o for auto import
// ctrl+shift +f for auto format file
// ctrl+space for auto suggestion