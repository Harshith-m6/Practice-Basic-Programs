package com.rc.programs;

import java.util.HashMap;
import java.util.Map;

public class ArrayFreqPrinting {
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,3,4,5,1,2};
		Map<Integer , Integer> freq = getFreq(arr);
		for(Map.Entry<Integer, Integer> eles : freq.entrySet())
		{
			System.out.println(eles.getKey()+" repeated "+eles.getValue()+" times");
		}
		
		int mfe =0;
		int frq =0;
		for(int key : freq.keySet())
		{
			if(freq.get(key)>frq)
			{
				mfe=key;
				frq=freq.get(key);
			}
		}
		System.out.println("Most frequent element "+mfe);
	}
	
	private static Map<Integer , Integer> getFreq(int[] arr)
	{
		Map<Integer , Integer> freq = new HashMap<>();
		for(int i : arr)
		{
			freq.put(i, freq.getOrDefault(i, 0)+1);
		}
		return freq;
	}
	
	

}
