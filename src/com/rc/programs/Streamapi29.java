package com.rc.programs;

import java.util.Arrays;

public class Streamapi29 {
	public static void main(String[] args) {
		//reverse the sentence
		String str = "god created human";
		
		String sentence = Arrays.stream(str.split(" ")).reduce("", (a,b)->b+" "+a);
		
		System.out.println(sentence.trim());
	}

}
