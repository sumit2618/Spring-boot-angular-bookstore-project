package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserRestController {

	private UserService userService;
	
	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/save")
	public User register(@RequestBody User theUser) {

		theUser.setUserId(0);
		
		System.out.println(theUser);
		long phone = theUser.getPhoneNo();

		User tempUser = userService.findByPhoneNo(phone);
		// getting user from database if user found then registration wont be done

		if (tempUser != null) {
			throw new RuntimeException("Phone Number is already register");
		}

		userService.save(theUser);
		return theUser;
	}

	@PostMapping("/check")
	public User loginUser(@RequestBody User theUser) {

		theUser.setUserId(0);
		
		long phone = theUser.getPhoneNo();
		String pass = theUser.getPassword();

		User tempUser = userService.findByPhoneNoAndPassword(phone, pass);
		
		System.out.println(tempUser);
		
		// getting user from database if user found then registration wont be done
		if (tempUser == null) {
			throw new RuntimeException("User Not Found");
		}
		return tempUser;
	}
	
	@GetMapping("/getUser")
	public List<User> getUserData() {
		return userService.findAll();
	}
	
	@GetMapping("/userById/{userId}")
	public User getUserDataById(@PathVariable int userId) {
		//return bookService.;
		return userService.getuserDataById(userId);
	}
}
