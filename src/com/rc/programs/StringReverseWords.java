package com.rc.programs;

public class StringReverseWords {
	public static void main(String[] args) {
		String sen = "Hello iam Harshith Kumar";
		String[] words = sen.split(" ");
		String rev="";
		
		for(int i =words.length-1;i>=0;i--)
		{
			rev+= words[i]+" ";
		}
		
		System.out.println(rev);
	}

}
