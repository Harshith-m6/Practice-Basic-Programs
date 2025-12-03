package com.rc.programs;
import java.util.function.Function;
//Function is a functional interface present in function package
// it has one method called apply() takes one argument and return one value
public class FunctionlInterfaceFunction {
	public static void main(String[] args) {
		Function<Integer , Double> fun1 = new Function<Integer , Double>()
				{
			@Override
			public Double apply(Integer t)
			{
				return t/2.0;
			}
				};
				
				Function<Integer , Double> fun2 = x->x/2.0;
				Function<String, Integer> fun3 = new String("Harshith")::indexOf;
				Function<String,Integer> fun4 = new Function<String , Integer>()
						{
					@Override
					public Integer apply(String str)
					{
						return Integer.parseInt(str);
					}
						};
						
						Function<String , Integer> fun5 = (str) -> Integer.parseInt(str);
						
						Function<String,Integer> fun6 = Integer::parseInt;
	}

}
