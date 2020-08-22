package com.ecommerce.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.CategoryRepository;
import com.ecommerce.model.Category;
import com.ecommerce.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository dao;
	
	
	@Override
	public Category addCategory(Category category) {
		
		return dao.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		
		return dao.save(category);
	}

	@Override
	public Category getCategoryById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteCategoryCyId(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Category> getAllCategories() {
		
		return dao.findAll();
	}

}
