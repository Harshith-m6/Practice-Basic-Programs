package com.rc.programs;
import java.util.*;
public class HashMap3 {
	public static void main(String[] args) {
		HashMap<Integer,Product> products = new HashMap<>();
		products.put(1, new Product("Mobile",100000.00));
		products.put(2, new Product("Laptop" , 100001.00));
		products.put(3, new Product("TV",60000.00));
		products.put(3, new Product("Ac",0000.00));
		
		Set<Map.Entry<Integer, Product>> setEntries = products.entrySet();
		
		for(Map.Entry<Integer, Product> ent : setEntries)
		{
			System.out.println(ent.getKey()+" " +ent.getValue());
		}
 
		
		
	}

}
