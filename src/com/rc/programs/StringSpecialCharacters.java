package com.rc.programs;
import java.util.*;
public class StringSpecialCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int special =0;
		for(int i =0 ; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(!((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z')|| (ch>='0'&&ch<='9')))
			{
				special++;
			}
		}
		System.out.println(special);
	}
	
	

}
