package com.rc.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamApi21 {
	//Reverse each word in the sentence
	public static void main(String[] args) {
		String str = "Harshith is a good boys";
		
		String res =Arrays.stream(str.split(" ")).map(word-> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		
		System.out.println(res);
		
	}

	
}
