package com.rc.programs;

public class StringVowelsConsonants {

	public static void main(String[] args) {
		String str = "Harshith";
		
		char[] str1 = str.toLowerCase().toCharArray();
		
		int vowels=0;
		int conso = 0;
		
		for(char ch : str1)
		{
			if("aeiou".indexOf(ch)>=0)
			{
				vowels++;
			}else
			{
				conso++;
			}
		}
		
		System.out.println(vowels+"  number of vowels , "+conso+" number of consonants" );
	}
}
