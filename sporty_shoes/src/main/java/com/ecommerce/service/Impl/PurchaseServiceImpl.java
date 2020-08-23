package com.ecommerce.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.PurchaseRepository;
import com.ecommerce.model.Purchase;
import com.ecommerce.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseRepository dao;
	
	@Override
	public Purchase addPurchase(Purchase purchase) {
		
		return dao.save(purchase);
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
	
		return dao.save(purchase);
	}

	@Override
	public Purchase getPurchaseById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Purchase> getPurchaseByDateOfPurchase(Date date) {
		
		return null;
	}

	@Override
	public List<Purchase> getPurchaseByCategory(String name) {
		
		return null;
	}

	@Override
	public List<Purchase> getAllPurchases() {
		
		return dao.findAll();
	}

	@Override
	public void deletePurchaseById(int id) {
		dao.deleteById(id);
		
	}

}
