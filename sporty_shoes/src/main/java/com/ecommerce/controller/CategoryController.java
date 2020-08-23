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

import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping("/category")
	public Category addCategory(@RequestBody  Category category) {
		
		return service.addCategory(category);
	}

	@PutMapping("/category")
	public Category updateCategory(@RequestBody  Category category) {
		
		return service.updateCategory(category);
	}

	@GetMapping("/category/{id}")
	public Category getCategoryById(@PathVariable int id) {
		
		return service.getCategoryById(id);
	}

	@DeleteMapping("/category/{id}")
	public void deleteCategoryCyId(@PathVariable int id) {
		service.deleteCategoryCyId(id);
		
	}

	@GetMapping("/categories")
	public List<Category> getAllCategories() {
		
		return service.getAllCategories();
	}
	
	@GetMapping("/categories/name/{name}")
    public List<Category> getCategoryByName(@PathVariable String name) {
		
		return service.getCategoryByName(name);
	}
}
