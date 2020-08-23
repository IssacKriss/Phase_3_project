package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.BussinessException;
import com.ecommerce.model.Cart;

public interface CartService {

	public Cart addCart(Cart cart);
	
	public Cart updateCart(Cart cart);
	
	public Cart getCartById(int id) throws BussinessException;
	
	public void deleteCartById(int id);
	
	public List<Cart> GetAllCarts();
	

}
