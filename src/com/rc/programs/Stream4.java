package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class Stream4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,8,7,6,5,4,3,10,11,12);
		List<Integer> sorted =list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println(sorted);
		
		
	}
}
