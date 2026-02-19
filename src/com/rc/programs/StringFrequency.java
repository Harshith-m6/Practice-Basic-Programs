package com.rc.programs;
import java.util.*;
public class StringFrequency {
	public static void main(String[] args) {
		String str = "programmming";
		Map<Character , Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		System.out.println(map);
	}

}
