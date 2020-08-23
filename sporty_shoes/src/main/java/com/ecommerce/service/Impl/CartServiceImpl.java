package com.ecommerce.service.Impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CartRepository;
import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.Cart;
import com.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository dao;
	
	@Override
	public Cart addCart(Cart cart) {
		
		return dao.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		
		return dao.save(cart);
	}

	@Override
	public Cart getCartById(int id) throws BussinessException {
		if (id <= 0) {
			throw new BussinessException("The cartId cannot be Zero or Negative. Please supply the right cartId.");
		}
		Cart cart = null;
		try {
			cart=dao.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new BussinessException("No cart found for the given id");
		}
		return cart;
	}

	@Override
	public void deleteCartById(int id) {
		
		 dao.deleteById(id);
	
	}

	@Override
	public List<Cart> GetAllCarts() {
		
		return dao.findAll();
	}

}
