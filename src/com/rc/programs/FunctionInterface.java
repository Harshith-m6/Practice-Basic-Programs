package com.rc.programs;

import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		Function<Integer, Boolean> fun1 = (x)-> (x%10+x/10+x%10*x/10)==x;
		System.out.println(fun1.apply(2));
		
		Function<Integer , Boolean> isPal = (x)-> new StringBuilder(x.toString()).reverse().toString().equals(x.toString());
		System.out.println(isPal.apply(125));
	}

}
