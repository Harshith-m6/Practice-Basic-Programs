package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi22 {
	public static void main(String[] args) {
		//Count number of letters in each word and map the words to count
		
		String str = "Harshith is a good boy in class";
		
		Map<Integer , List<String>> maps = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(String::length));
		System.out.println(maps);
		
	}

}
