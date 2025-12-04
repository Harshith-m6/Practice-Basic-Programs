package com.rc.programs;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Function;

public class StreamApi5 {
	//Calculate sum of all even numbers by doubling
	public static void main(String[] args) {
		List<Integer> values = List.of(23,45,68,89,43,24);
		//covert the list into stream
		
		Predicate<Integer> p = x->x%2==0;
		
		Function<Integer , Integer> f = x->x*2;
		
		BinaryOperator<Integer> bo = (a,b)->a+b;
		
		int sum = values.stream().filter(p).map(f).reduce(0,bo);
		
		int total = values.stream().filter(a->a%2==0).map(x->x*2).reduce(0, (x,y)->x+y);
		
		System.out.println(total);
	}

}
