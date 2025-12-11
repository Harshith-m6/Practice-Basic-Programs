package com.rc.programs;

import java.util.stream.IntStream;

public class StreamApi24 {
	
	public static void main(String[] args) {
		//check string is a palindrome or not
		String str = "madam";
		
		str.toLowerCase().chars();
		
		boolean res =IntStream.range(0, str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
		
		boolean res1 =IntStream.range(0, str.length()/2).anyMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
		if(res)
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		if(res1)
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
