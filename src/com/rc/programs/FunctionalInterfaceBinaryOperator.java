package com.rc.programs;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
public class FunctionalInterfaceBinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Integer> bo1 = new BinaryOperator<Integer>()
				{
			@Override
			public Integer apply(Integer x , Integer y)
			{
				return x+y;
			}
				};
				
				BinaryOperator<Integer> bo2 = (x,y)->x+y;
				
				BinaryOperator<Integer> bo3 = (x,y)->Integer.compare(x,y);
				
				BinaryOperator<Integer> bo4= new BinaryOperator<Integer>()
						{
					@Override
					public Integer apply(Integer x , Integer y)
					{
						return Integer.compare(x, y);
					}
						};
						
			BinaryOperator<Integer> bo5 = Integer::compare;
			
			BinaryOperator<Integer> bo6 = (x,y)-> Integer.compare(x,y);
			
			BinaryOperator<Integer> bo7 = Integer::compare;
			
			bo7.apply(7, 8);
			
			BiFunction<Double , Double , Integer> bo8 = Double::compare;
						
	}

}
