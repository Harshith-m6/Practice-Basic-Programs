package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class Streamapi23 {
	public static void main(String[] args) {
		//group each words by their initial letters
		
		String str = "Harshith is a good boy and has a good behavior";
		
		Map<Character , List<String>> maps = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(word->str.charAt(0)));
		
		System.out.println(maps);
	}

}
