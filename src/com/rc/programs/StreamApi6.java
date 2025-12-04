package com.rc.programs;
import java.util.List;
import java.util.function.*;
public class StreamApi6 {
	
	public static void main(String[] args) {
		List<Integer> values = List.of(23,45,68,89,43,24);
		
		int sum = values.stream().reduce(0, (a,b)->a+b);
		
		System.out.println(sum);
		
		int product = values.stream().reduce(1,(x,y)->x*y);
		
		int sodd = values.stream().filter(x->x%2==1).reduce(0,(x,y)->x+y);
		
		long count = values.stream().filter(x->x%2==1).count();
		
		System.out.println(count);
		
	}

}
