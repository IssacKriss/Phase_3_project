package com.ecommerce.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.UserRepository;
import com.ecommerce.model.User;
import com.ecommerce.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository dao;
	
	@Override
	public User authenticate(String user_id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User user) {
		
		return dao.save(user);
	}

	@Override
	public User updateUser(User user) {
		
		return dao.save(user);
	}

	@Override
	public User getUserById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<User> getAllUsers() {
		
		return dao.findAll();
	}

	

	@Override
	public List<User> getAllUsersByName(String name) {
	
		return dao.findByName(name);
	}

}
