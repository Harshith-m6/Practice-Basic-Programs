package com.rc.programs;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
public class StreamApi7 {
	public static void main(String[] args) {
		List<Integer> values = List.of(23,45,68,89,43,24);
	
//		int max = Collections.max(values);
//		System.out.println(max);
				
		//autoboxing happens in the stream
		
		int big = values.stream().max((a,b)->a-b).orElse(0);
		System.out.println(big);
		
		int obig = values.stream().filter(a->a%2==1).max(Integer::compare).get();
		System.out.println(obig);
		
		//if it doesnt returns any value it throws NoSuchElements Present
		
		
	}
}
