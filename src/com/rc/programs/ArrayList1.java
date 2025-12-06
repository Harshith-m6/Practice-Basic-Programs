package com.rc.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,2,1,3,4,5));
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		// HashSet uses HashMap internally in key (Element) and value(boolean present) is not present HashMap's map.put() returns true if present HashMap's map.put(element , present)returns false
		// add(element) method in HashSet returns boolean true if element is added false if element is not added
		for(Integer x : a)
		{
			if(!seen.add(x)) //false if element is present 
			{
				duplicate.add(x);
			}
		}
		
		System.out.println(duplicate);
		
		
	}

}
