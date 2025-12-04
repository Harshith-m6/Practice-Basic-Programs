package com.rc.programs;

import java.util.Comparator;

public class FunctionalInterface2 {
	public static void main(String[] args) {
		Comparator<Integer> c1 = new Comparator<Integer>()
				{
			@Override
			public int compare(Integer v1 , Integer v2)
			{
				return Integer.compare(v1, v2);
			}
				};
				
				Comparator<Integer> c2 = (v1,v2)->Integer.compare(v1, v2);
				
				Comparator<Integer> c3 = Integer::compare;
				
				Comparator<Double> c4 = Double::compare;
				
				Comparator<String> c5 = String::compareTo;
	}

}
