package com.rc.programs;

import java.util.ArrayList;
import java.util.*;

public class ArrayList5 {

	//Count of occurance of the values
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList(Arrays.asList(1,9,8,7,2,2,2));
		HashMap<Integer , Integer> freq = new HashMap<>();
		for(Integer n : nums)
		{
			freq.put(n, freq.getOrDefault(n, 0)+1);
			//HashMap paired with key and value , duplicate values are allowed but duplicate keys are not allowed , key will override with new values for the same key eg (a,2) (a,3) for maps.get(a) returns 3
			//getOrDefault returns the value of the key if present or else null value
		}
		
		System.out.println(freq);
		}
}
