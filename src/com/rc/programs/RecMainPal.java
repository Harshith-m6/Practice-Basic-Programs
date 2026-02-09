package com.rc.programs;

public class RecMainPal {
	public static void main(String[] args) {
		RecursionPalindrome1 r = new RecursionPalindrome1();
		boolean pal =r.palindrome("MadaM");
		System.out.println(pal?"Palindrome":"not a palindrome");
	}

}
