package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.User;

public interface UserService {

	public User authenticate(String user_id, String password);
	
	public User addUser(User user);
	
	public User updateUser(User user);
	
	public User getUserById(int id) throws BussinessException;
	
	public void deleteUserById(int id);
	
	public List<User> getAllUsers();
	
	public List<User> getAllUsersByName(String name);
}
