package com.rc.programs;

import java.util.function.Predicate;

public class FunctionalInterfacePredicate {
	public static void main(String[] args) {
		Predicate<Integer> isEven = new Predicate<Integer>() {
			@Override
			public boolean test(Integer a)
			{
				return a%2==0;
				
			}
		};
	}

}
