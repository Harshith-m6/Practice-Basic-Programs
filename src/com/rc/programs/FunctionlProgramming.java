package com.rc.programs;

import java.util.Arrays;
import java.util.List;

public class FunctionlProgramming {
	static void visible(Object o)
	{
		System.out.println("Hello "+o);
	}
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(23,45,67,43,32);
		values.forEach(System.out::println);
		values.forEach(FunctionlProgramming::visible);
	}

}
