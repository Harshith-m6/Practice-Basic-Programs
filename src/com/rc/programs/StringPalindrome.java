package com.rc.programs;

public class StringPalindrome {
	public static void main(String[] args) {
		String s1 = "ollo";
		
		s1 = s1.toLowerCase();
		int i =0 ; 
		boolean ispal = true;
		int j=s1.length()-1;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
				ispal = false;
				break;
			}
			i++;
			j--;
		}
		
		System.out.println(ispal?"Palindrome ":" not a palindrome");
		
		
	}

}
