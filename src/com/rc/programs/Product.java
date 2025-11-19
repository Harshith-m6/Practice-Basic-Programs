package com.rc.programs;

public class Product {
	String name ;
	double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	

}
