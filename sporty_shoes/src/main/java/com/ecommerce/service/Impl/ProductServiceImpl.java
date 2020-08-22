package com.ecommerce.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ProductRepository;
import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository dao;
	
	@Override
	public Product addProduct(Product product) {
		
		return dao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return dao.save(product);
	}

	@Override
	public Product getProductById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteProductById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Product> getAllProducts() {
	
		return dao.findAll();
	}

	@Override
	public List<Product> getProductsByBrand(String brand) {
		
		return null;
	}

}
