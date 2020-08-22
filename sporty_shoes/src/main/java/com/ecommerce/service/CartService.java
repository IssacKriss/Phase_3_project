package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Cart;

public interface CartService {

	public Cart addCart(Cart cart);
	
	public Cart updateCart(Cart cart);
	
	public Cart getCartById(int id);
	
	public void deleteCartById(int id);
	
	public List<Cart> GetAllCarts();
	

}
