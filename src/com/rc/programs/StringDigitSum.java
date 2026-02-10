package com.rc.programs;

import java.util.Scanner;

public class StringDigitSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		char[] str1 = str.toCharArray(); 
		int sum=0;
		for(int i =0; i<str1.length; i++)
		{
			
			if(str1[i]>='0'&&str1[i]<='9')
			{
				sum+=str1[i];
			}
		}
		System.out.println(sum);
	}

}
