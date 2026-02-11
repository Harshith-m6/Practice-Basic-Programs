package com.rc.programs;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementsFrequency {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,1,3,2,4};
		
		HashMap<Integer , Integer > map = new HashMap<>();
		for(int n : arr)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		
		System.out.println("frequency of elements");
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
