package com.rc.programs;
import java.util.*;
public class StringRemoveDups {
	public static void main(String[] args) {
		String str = "programming";
		Map<Character , Integer> map = new HashMap<>();
		for(char ch : str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		
		StringBuilder unique = new StringBuilder();
		for(Map.Entry<Character, Integer> freq : map.entrySet())
		{
			if(freq.getValue()==1)
			{
				unique.append(freq.getKey());
			}
		}
		
		System.out.println(unique );
		
	}

}
