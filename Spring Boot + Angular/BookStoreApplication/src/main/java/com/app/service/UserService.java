package com.app.service;

import java.util.List;

import com.app.entity.Book;
import com.app.entity.User;

public interface UserService {

	public void save(User theUser);

	public List<User> findAll();

	public User findByPhoneNo(long phone);
	
	public User findByPhoneNoAndPassword(long phone , String password);

	public User getuserDataById(int userId);
}
