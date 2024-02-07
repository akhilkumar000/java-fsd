package com.app.service;

import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repository.UserRepository;


@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void registerUser(User user) {
		userRepository.save(user);
	}
}