package com.buffalo.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buffalo.edu.entity.Role;
import com.buffalo.edu.service.RoleService;


@RestController
@RequestMapping("/role")
@CrossOrigin(origins = "*")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@GetMapping("/get-all-roles")
	public List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
	
	@PostMapping("/add-role")
	public Role createRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
}
