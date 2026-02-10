package com.rc.programs;
import java.util.*;
public class StringDigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int charCount=0;
		for(int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch>=48 && ch<=57) // ASCII values of digits is 0=48 to 9=57
			{
				charCount++;
			}
		}
		System.out.println(charCount);
		
	}

}
