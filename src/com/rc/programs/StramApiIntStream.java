package com.rc.programs;
import java.util.*;
import java.util.stream.IntStream;
public class StramApiIntStream {
	public static void main(String[] args) {
		
		IntStream.range(1,10).forEach(x->System.out.print(x+" "));
		
		
		System.out.println();
		IntStream.range(1, 20).forEach(System.out::print);
		System.out.println();
		int sum = IntStream.range(1, 10).sum();
		System.out.println(sum);
		
		int max = IntStream.of(23,22,1,45,67,87).max().getAsInt();
		
		System.out.println(max);
		
		int[] arr = {12,21,34,56,78,99};
		
		int min = IntStream.of(arr).min().getAsInt();
		
		System.out.println(min);
		
		int esum = IntStream.rangeClosed(1, 20).filter(x->x%2==0).sum();
		
		System.out.println(esum);
		
		IntStream.rangeClosed(1, 20).filter(x->x%2==1).forEach(System.out::print);
		
		List<Integer> listOf3 = IntStream.rangeClosed(1, 100).filter(x->x%3==0).boxed().toList();
		
		System.out.println(listOf3);
	}

}
