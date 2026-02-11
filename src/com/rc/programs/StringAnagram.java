package com.rc.programs;

public class StringAnagram {
	
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 ="silent";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not anagram");
			return;
		}
		
		int[] count = new int[256];
		
		for(int i = s1.length()-1 ; i>=0 ; i--)
		{
			count[i]++;
			count[i]--;
		}
		
		for(int i : count)
		{
			if(i!=0)
			{
				System.out.println("Not a anagram");
				break;
			}
		}
		
		System.out.println("Anagram");
	}

}
