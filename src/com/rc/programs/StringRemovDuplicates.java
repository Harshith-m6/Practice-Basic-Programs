package com.rc.programs;

public class StringRemovDuplicates {
	public static void main(String[] args) {
		String str = "banana";
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(char c  : ch)
		{
			if(sb.indexOf(String.valueOf(c))==-1)
			{
				sb.append(c);
			}
		}
		
		System.out.println(sb);
		
	}

}
