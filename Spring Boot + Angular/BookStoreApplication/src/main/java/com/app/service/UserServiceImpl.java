package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.entity.User;
import com.app.entity.dao.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo repo;

	public UserServiceImpl(UserRepo repo) {

		this.repo = repo;
	}

	@Override
	public void save(User theUser) {

		repo.save(theUser);
	}

	@Override
	public List<User> findAll() {

		return repo.findAll();
	}

	@Override
	public User findByPhoneNo(long phone) {

		return repo.findByPhoneNo(phone);
	}

	@Override
	public User findByPhoneNoAndPassword(long phone, String password) {
		return repo.findByPhoneNoAndPassword(phone, password);
	}

	@Override
	public User getuserDataById(int userId) {

		Optional<User> result = repo.findById(userId);

		User theUser = null;
		if (result.isPresent()) {
			theUser = result.get();
		} else {
			// we did not find the user
			throw new RuntimeException("Did not find User = " + userId);
		}
		return theUser;
	}

}
