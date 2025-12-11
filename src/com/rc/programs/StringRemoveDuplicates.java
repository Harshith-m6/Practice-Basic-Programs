package com.rc.programs;
import java.util.*;
public class StringRemoveDuplicates {
	public static void main(String[] args) {
		String str = "harshith";
		char[] chs = str.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		
		for(char ch : chs)
		{
			hs.add(ch);
		}
		
		System.out.println(hs);
	}

}
