package com.rc.programs;

import java.util.Scanner;

public class RecursionStringReverse {
	
	static String reverse(String st)
	{
		if(st.length()==1)
			return st;
		
		return st.charAt(st.length()-1)+reverse(st.substring(0,st.length()-1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		System.out.println("Reverse "+reverse(s));
		
	}

}
