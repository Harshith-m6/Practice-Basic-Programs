package com.rc.programs;
import java.util.*;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer , String> hm = new HashMap<>();
		hm.put(1,"Apple");
		hm.put(2,"Orange");
		hm.put(3, "pineapple");
		hm.put(2, "Grapes"); //put is used to add the pairs into the HashMap
		hm.put(4, "Pomo");
		hm.put(5, "coco");
		
		System.out.println(hm); // toString method will be overridden
		
		System.out.println(hm.size());
		System.out.println(hm.keySet()); //duplicates will be not added 
		//keys hashcode will be checked internally if duplicate then not add only values of the duplicated keys will be replaced
		
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		Collection<String> values = hm.values();
		System.out.println(values);
		
		//Every pairs in HashMap is a Entry
		//Entry is a nested interface of Map ,, Entry is present inside the Map interface
		//get(key) , get(Value) , get() are the methods present inside the Entry interface
		for(Integer k : keys)
		{
			System.out.println(k+" => "+ hm.get(k));  //get(key) method gives corresponding values of the keys
		}
	}

}
