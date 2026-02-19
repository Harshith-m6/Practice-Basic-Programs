package com.rc.programs;
import java.util.*;
public class StringUnique {
	public static void main(String[] args) {
		String str = "harshith";
		Map<Character , Integer> map = new LinkedHashMap<>();
		for(Character ch : str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> freq : map.entrySet())
		{
			if(freq.getValue()==1)
			{
				System.out.println("Unique element : "+freq.getKey());
			}
		}
		
	}

}
