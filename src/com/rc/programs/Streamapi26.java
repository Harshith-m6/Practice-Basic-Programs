package com.rc.programs;

import java.util.Arrays;

public class Streamapi26 {
	public static void main(String[] args) {
		//Convert array of words into sentence
		String[] words = {"rama","seeta","laxmana"};
		String sentence ="";
		for(String s : words)
		{
			sentence+=s+" "; //sentence=word+" "+sentence;
		}
		
		System.out.println(sentence);
		
		String sentence2 = Arrays.stream(words).reduce("", (a,b)->b+" "+a);
		
		System.out.println(sentence2.trim());
	}

}
