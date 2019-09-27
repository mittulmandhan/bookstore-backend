package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bookstore.dao.UserRepository;
import com.bookstore.dto.UserDTO;
import com.bookstore.model.User;
import com.bookstore.utility.Authority;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		List<Authority> authority = new ArrayList<Authority>();
		if (user.getIsAdmin()) {
			authority.add(new Authority("Admin"));
		} else {
			authority.add(new Authority("User"));
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				authority);
	}

	public User save(UserDTO user) {

		User existingUser = userDao.findByUsername(user.getUsername());

		if (existingUser != null) {
			throw new RuntimeException("User Already exist");
		}

		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return userDao.save(newUser);
	}
}