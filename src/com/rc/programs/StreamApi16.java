package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi16 {
	public static void main(String[] args) {
		String str = "Hi iam harshith iam currently pursuing the java full stack development";
		String[] words = str.split(" ");
		Map<String , Long> frq = Arrays.stream(words).collect(Collectors.groupingBy(s->s , Collectors.counting()));
		System.out.println(frq);
		
		frq.forEach((x,y)->System.out.println(x+" = "+y));
	}

}
