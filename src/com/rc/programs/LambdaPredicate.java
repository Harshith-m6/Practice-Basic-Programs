package com.rc.programs;
import java.util.*;
import java.util.function.Predicate;
public class LambdaPredicate {
	public static void main(String[] args) {
		class EvenOdd implements Predicate<Integer>{

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
		}
		Predicate<Integer> eo = (t)->t%2==0;
		Predicate<Integer> isPrime =(t)->{
			if(t<=1)
				return false;
			for(int i=2 ; i*i<=t ; i++)
			{
				if(t%i==0)
					return false;
			}
			return true;
		};
	}

}
