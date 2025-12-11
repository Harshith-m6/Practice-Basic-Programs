package com.rc.programs;
import java.util.*;
public class StringFrequencyOfCharacters {
	public static void main(String[] args) {
		 String str = "harshith is a good boy";
		 char[] chs = str.toCharArray();
//		for(char ch : chs)
//		{
//			System.out.println(ch);
//		}
		 
		 Map<Character , Integer> maps = new HashMap<>();
		 for(char ch : chs)
		 {
			 maps.put(ch, maps.getOrDefault(ch, 0)+1);
		 }
		 
		 System.out.println(maps);
	}

}
