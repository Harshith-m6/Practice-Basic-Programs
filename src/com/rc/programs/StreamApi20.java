package com.rc.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamApi20 {
	//group words based length
	public static void main(String[] args) {
		String str = "hi iam a good boy";
		String[] words = str.split(" ");
		
		Arrays.stream(words).collect(Collectors.groupingBy(String::length)).forEach((k,v)->System.out.println(k+" = "+v));
		
		
		Arrays.stream(words).collect(Collectors.groupingBy(s->s.length())).forEach((k,v)->System.out.println(k+" = "+v));
	}

}
