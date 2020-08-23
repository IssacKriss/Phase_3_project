package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	
	public User authenticate(String user_id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
	
		return service.addUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		
		return service.updateUser(user);
	}

    @GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		
		return service.getUserById(id);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable int id) {
		
		
	}

    @GetMapping("/users")
	public List<User> getAllUsers() {
		
		return service.getAllUsers();
	}

    @GetMapping("/user/name/{name}")
	public List<User> getAllUsersByName(@PathVariable String name) {
		
		return service.getAllUsersByName(name);
	}
	
	
}
