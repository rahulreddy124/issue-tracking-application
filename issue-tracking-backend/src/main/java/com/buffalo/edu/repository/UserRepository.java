package com.buffalo.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buffalo.edu.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
