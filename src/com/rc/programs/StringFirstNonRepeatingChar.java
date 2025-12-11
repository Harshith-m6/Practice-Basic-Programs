package com.rc.programs;
import java.util.*;

public class StringFirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "appu";
		HashMap<Character , Integer> hm = new HashMap<>();
		for(char c : str.toCharArray())
		{
		hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(var e : hm.entrySet())
		{
			if(e.getValue()==1)
			{
				System.out.println(e.getKey());
			}
		}
		
		
	}

}
