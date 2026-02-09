package com.rc.programs;

public class RecursionReverseStringSubString {
	
	String rev(String str)
	{
		return revSub(str);
	}
	
	private String revSub(String str)
	{
		if(str.length()==0)
		{
			return str;
		}
		
		return str.charAt(str.length()-1)+revSub(str.substring(0,str.length()-1));
	}

}
