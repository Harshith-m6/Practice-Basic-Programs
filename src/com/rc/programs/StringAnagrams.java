package com.rc.programs;
import java.util.*;
public class StringAnagrams {
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		Map<Character , Integer> map = new HashMap<>();
		
		for(char ch : str1.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : str2.toCharArray())
		{
			if(!map.containsKey(ch)) {
				System.out.println("Not a Anagram");
				return;
			}
			
			map.put(ch, map.get(ch)-1);
			if(map.get(ch)==0)
			{
				map.remove(ch);
			}
			
		}
		if(map.isEmpty())
		{
			System.out.println("Anagram");
		}else {
			System.out.println("Not a anagram");
		}
	}

}
