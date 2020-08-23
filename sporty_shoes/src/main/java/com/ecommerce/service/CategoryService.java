package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Category;

public interface CategoryService {

	public Category addCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public Category getCategoryById(int id);
	
	public void deleteCategoryCyId(int id);
	
	public List<Category> getAllCategories();
	
	 public List<Category> getCategoryByName(String name);
	
	
}
