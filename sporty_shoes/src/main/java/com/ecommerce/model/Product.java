package com.ecommerce.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	
	private String product_name;
	private BigDecimal price;
	private Date dateAdded;
	private String brand;
	private String color;
	
	@ManyToMany(mappedBy = "products")
	private List<Cart> carts = new ArrayList<>();

	public Product(int product_id, String product_name, BigDecimal price, Date dateAdded, String brand, String color) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.dateAdded = dateAdded;
		this.brand = brand;
		this.color = color;
		
		
	}
	

}
