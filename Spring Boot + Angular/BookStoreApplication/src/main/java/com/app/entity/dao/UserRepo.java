package com.app.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByPhoneNo(long phone);
	public User findByPhoneNoAndPassword(long phone, String password);
}
