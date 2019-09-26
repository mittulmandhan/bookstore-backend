package com.bookstore.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.bookstore.dto.SignupRequestDTO;
import com.bookstore.dto.SignupResponseDTO;

@Service
public class SignupService {

	public SignupResponseDTO registerUser(SignupRequestDTO requestDTO) {
		return getResponseObject(requestDTO);
	}

	private SignupResponseDTO getResponseObject(SignupRequestDTO requestDTO) {
		SignupResponseDTO response = new SignupResponseDTO();
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
