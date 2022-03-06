package com.buffalo.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.edu.entity.User;
import com.buffalo.edu.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/get-all-users")
	private List<User> getAllUsers(){
	  return userService.getAllUsers();
	}
	
	@PostMapping("/add-user")
	private User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
}
