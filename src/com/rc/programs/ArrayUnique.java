package com.rc.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayUnique {
	public static void main(String[] args) {
		int[] ar = {5,6,7,6,5};
		Map<Integer , Integer> frq = new LinkedHashMap<Integer , Integer>();
		for(int ele : ar)
		{
			frq.put(ele, frq.getOrDefault(ele, 0)+1);
			
		}
		
		for(int key : frq.keySet())
		{
			if(frq.get(key)==1)
			{
				System.out.println(key);
				return ;
			}
		}
	}

}
