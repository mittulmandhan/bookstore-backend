package com.bookstore.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.bookstore.dto.SignupRequestDTO;
import com.bookstore.dto.SignupResponseDTO;

@Service
public class SignupService {

	public SignupResponseDTO registerUser(SignupRequestDTO requestDTO) {
		SignupResponseDTO responseDTO = new SignupResponseDTO();
		responseDTO.setUserId(1);
		responseDTO.setName(requestDTO.getName());
		responseDTO.setAddress(requestDTO.getAddress());
		responseDTO.setContactNo(requestDTO.getContactNo());
		responseDTO.setRoles(Arrays.asList("Admin"));
		responseDTO.setToken("7648217468724682734682");
		requestDTO.setPassword("123456");
		return responseDTO;
	}
}
