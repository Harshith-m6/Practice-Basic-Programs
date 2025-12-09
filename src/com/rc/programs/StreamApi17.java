package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi17 {
	//frequency of each character in string
	public static void main(String[] args) {
		String str = "banana";
		
		Map<Character , Long> cf = str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		cf.forEach((k,v)->System.out.println(k+" = "+v));
	}

}
