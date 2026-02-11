package com.rc.programs;

import java.util.Scanner;

public class StringVowelsConsonantsSpecial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int vowel=0;
		int conso=0;
		String vow = "AEIOUaeiou";
		for(int i =0; i< str.length();i++)
		{
			char ch = str.charAt(i);
			if(((ch>='a'&&ch<='z')|| (ch>='A'&&ch<='Z')))
			{
				if(vow.indexOf(ch)!=-1)
				{
					vowel++;
				}else
				{
					conso++;
				}
			}
		}
		System.out.println("Vowels "+vowel+"\nConsonants "+conso);
		
	}

}
