package com.rc.programs;

public class RecursionReverseString1 {
	
	String revStr(String str)
	{
		return rev(str,str.length()-1);
	}
	private String rev(String s ,int ind)
	{
		if(ind<0)
			return "";
		return s.charAt(ind)+rev(s,ind-1);
	}

}
