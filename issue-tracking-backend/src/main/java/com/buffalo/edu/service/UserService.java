package com.buffalo.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buffalo.edu.entity.User;
import com.buffalo.edu.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
       return userRepository.findAll();		
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
