package com.ec2sample.app.ec2demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ec2sample.app.ec2demo.model.User;
import com.ec2sample.app.ec2demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
}
