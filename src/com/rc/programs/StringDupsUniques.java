package com.rc.programs;
import java.util.*;
public class StringDupsUniques {
	public static void main(String[] args) {
		String str = "programming";
		Set<Character> unique = new HashSet<>();
		Set<Character> dups = new HashSet<>();
		
		for(char ch : str.toCharArray())
		{
			if(!unique.add(ch))
			{
				dups.add(ch);
			}
		}
		
		System.out.println("Duplicates "+dups);
		
	}

}
