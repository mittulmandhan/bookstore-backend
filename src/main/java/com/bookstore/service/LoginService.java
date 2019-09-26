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
		response.setName("Pawan ");
		response.setRoles(Arrays.asList("Admin"));
		response.setToken("7648217468724682734682");
		return response;
	}

}
