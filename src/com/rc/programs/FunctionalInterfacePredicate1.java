package com.rc.programs;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacePredicate1 {
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = new Predicate<Integer>()
				{
			@Override
			public boolean test(Integer t)
			{
				return t%2==0;
			}
				};
				
				Predicate<Integer> iseven = t->t%2==0;
				Predicate<Integer> Iseven  = new EVENODD()::checkEven;
				List<Integer> ls = List.of(1,2,3,4,5);
				
				Predicate<Integer> p1 = ls::contains;
				p1.test(23);
				
				Predicate<Integer> p2 = ls::add;
				p2.test(77);
	}

}
