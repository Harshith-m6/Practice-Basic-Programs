package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi19 {
	public static void main(String[] args) {
		int[] ar = {23,45,67,89,34,56,78};
		Map<String,List<Integer>> frq = Arrays.stream(ar).mapToObj(x->(int)x).collect(Collectors.groupingBy(x->(x%2==0)?"Even":"Odd"));
		
		frq.forEach((k,v)->System.out.println(k+" = "+v));
	}

}
