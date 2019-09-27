package com.bookstore.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.bookstore.dto.LoginRequestDTO;
import com.bookstore.dto.LoginResponseDTO;

@Service
public class LoginService {

	public LoginResponseDTO authenticateUser(LoginRequestDTO requestDTO) {
		return getResponseObject(requestDTO);
	}

	private LoginResponseDTO getResponseObject(LoginRequestDTO requestDTO) {
		LoginResponseDTO response = new LoginResponseDTO();
		response.setUsername(requestDTO.getUsername());
		response.setUserId(234);
		response.setAddress("Delhi");
		response.setContactNo("9211111875");
		response.setName(requestDTO.getUsername());
		if(requestDTO.getUsername().equals("Admin"))
			response.setRoles(Arrays.asList("Admin"));
		else
			response.setRoles(Arrays.asList("User"));
		response.setToken("764821746872468273");
		return response;
	}

}
