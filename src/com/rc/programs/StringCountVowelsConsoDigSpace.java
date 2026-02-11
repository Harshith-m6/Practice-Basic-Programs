package com.rc.programs;

public class StringCountVowelsConsoDigSpace {
	
	public static void main(String[] args) {
		String str = "harshith earns 100000";
		int vowels =0;
		int conso =0;
		int dig =0;
		int space =0;
		
		str = str.toLowerCase();
		for(int i = 0 ; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				dig++;
			}
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}else if(ch>='a'&&ch<='z')
			{
				conso++;
			}
			
			if(ch==' ')
			{
				space++;
			}
			

		}
		System.out.println("vowels = "+vowels+" consonants= "+conso+" digits= "+dig+" spcaes= "+space);
	}

}
