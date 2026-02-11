package com.rc.programs;

public class StringPalindromeOptimised {
	public static void main(String[] args) {
		String str = "madam";
		boolean isPal = true;
		for(int i = 0 ; i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				isPal = false;
			}
		}
		
		System.out.println(isPal?"Palindrome":"Not a Palindrome");
	}

}
