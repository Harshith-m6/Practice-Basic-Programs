package com.rc.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamApi18 {
	public static void main(String[] args) {
		int[] ar = {23,45,67,89};
		
		Arrays.stream(ar).forEach(x->System.out.println(x));
		
		List<Integer> values = List.of(45,68,89,54,34);
		values.forEach(x->System.out.println(x));
		
		Map<String , Integer> freq = Map.of("Rama",3 ,"Laxmana" , 4 , "Seeta" , 2 , "the" , 5);
		freq.forEach((k,v)->System.out.println(k+" = "+v));
	}

}
