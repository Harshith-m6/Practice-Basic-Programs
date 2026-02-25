package com.rc.programs;
import java.util.*;
public class NestedCollections {
	public static void main(String[] args) {
		Map<String,Set<Long>> contactDir = new TreeMap<String,Set<Long>>();
		contactDir.put("Harshith", new TreeSet<Long>(Arrays.asList(45678l , 98765l)));
		for(String name : contactDir.keySet())
		{
			System.out.println(name+" -> "+contactDir.get(name).size());
		}
	}
	

}
