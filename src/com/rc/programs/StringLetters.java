package com.rc.programs;
import java.util.*;
public class StringLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int small =0; int cap =0;
		for(int i =0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				small++;
			}else if(ch>='A'&&ch<='Z')
			{
				cap++;
			}
		}
		System.out.println("Number of small letters "+small+"\nNumber of Capital letters "+cap);
	}
}
