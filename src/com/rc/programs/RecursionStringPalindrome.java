package com.rc.programs;

public class RecursionStringPalindrome {
	
	static boolean isPal(String str , int fwd , int bwd)
	{
		if(fwd>=bwd)
			return true;
		if(str.charAt(fwd)!=str.charAt(bwd))
			return false;
		return isPal(str , fwd+1 , bwd-1);
	}
	static boolean isPal(String x)
	{
		return isPal(x,0,x.length()-1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPal("MadaM"));
	}

}
