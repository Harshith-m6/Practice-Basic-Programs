package com.rc.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
//Grouping of the elements in the Array by their frequency
public class StreamApi15 {
	public static void main(String[] args) {
		int[] ar = {36,56,78,34,56,78,89,98,56};
		
		Map<Integer , Long> freq = Arrays.stream(ar).boxed().collect(Collectors.groupingBy(n->n ,TreeMap::new , Collectors.counting()));
		
		System.out.println(freq);
		
		//elements in sorted order - used TreeMap
		
	}

}
