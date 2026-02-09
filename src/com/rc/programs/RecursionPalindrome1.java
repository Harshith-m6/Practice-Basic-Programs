package com.rc.programs;

public class RecursionPalindrome1 {
	
	boolean palindrome(String s)
	{
		return isPal(s , 0 , s.length()-1);
	}
	
	private boolean isPal(String s , int l , int h)
	{
		if(l>=h)
		{
			return true;
		}
		
		if(s.charAt(l)!=s.charAt(h))
		{
			return false;
		}
		
		return isPal(s , l+1 , h-1);
	}

}
