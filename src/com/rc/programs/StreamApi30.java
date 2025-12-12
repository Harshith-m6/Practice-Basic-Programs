package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi30 {
	public static void main(String[] args) {
		//frequency of each word in the sentence
		String str = "java is fun java is powerful";
		Map<String , Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
		
		System.out.println(map);
		
		map.forEach((k,v)->System.out.println(k+" "+v));
	}

}
