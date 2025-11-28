package com.rc.programs;

public class StringRotation {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 ="deabc";
		boolean rs = isRotation(s1,s2);
		System.out.println(rs?"yes":"no");
	}
	
	static boolean isRotation(String s1 , String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		return (s1+s2).contains(s2);  // also (s1+s2).indexOf(s2);
	}

}
