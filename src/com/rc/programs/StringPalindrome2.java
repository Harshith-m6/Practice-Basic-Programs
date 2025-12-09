package com.rc.programs;

public class StringPalindrome2 {
	public static void main(String[] args) {
		String s1 = "madam";
		String s2 = "";
		
		for(int i = 0 ; i<s1.length();i++)
		{
			s2+=s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome ");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
