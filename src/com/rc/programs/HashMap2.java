package com.rc.programs;
import java.util.*;
public class HashMap2 {
	public static void main(String[] args) {
		HashMap<String, Double> names = new HashMap<>();
		names.put("Gagan", 70.00);
		names.put("Tejas", 80.00);
		names.put("Harshith", 90.99);
		names.put("Pavan", 98.0);
		names.put("Harshith", 99.00);
		// node is a type of Entry the key-values pair stored as Entry inside the HashMap
		
		Set<Map.Entry<String, Double>> entries = names.entrySet();
		//.entrySet returns the Set of Entry 
		
		//entries are the Set of Entry object
		
		for(Map.Entry<String, Double> ent : entries)
		{
			System.out.print(ent.getKey()+" => "+ent.getValue() +"\n");
			
		}
		
		//for all the entries to get as Set
		//Set is a Collection of Entry objects , in Entries objects are stored as key , value pairs
		
	}

}
