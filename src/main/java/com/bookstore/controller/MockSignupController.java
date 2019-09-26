package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dto.LoginResponseDTO;
import com.bookstore.dto.SignupRequestDTO;
import com.bookstore.service.LoginService;

@CrossOrigin
@RestController
public class MockSignupController {
	
	@Autowired
	private SignupService signupService;
	
	@PostMapping(path = "/signup")
	public LoginResponseDTO authenticateUser(@RequestBody SignupRequestDTO requestDTO) {
		System.out.println(requestDTO.getUsername() + " , " + requestDTO.getPassword());
		return signupService.authenticateUser(requestDTO);
	}
}
