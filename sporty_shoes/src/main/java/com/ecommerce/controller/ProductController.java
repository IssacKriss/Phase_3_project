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

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;


	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}

	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
	
		return service.updateProduct(product);
	}

	 @GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return service.getProductById(id);
	}

	@DeleteMapping("/product/{id}")
	public void deleteProductById(@PathVariable int id) {
		service.deleteProductById(id);
		
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		
		return service.getAllProducts();
	}

	
	public List<Product> getProductsByBrand(String brand) {
	
		return service.getProductsByBrand(brand);
	}
}
