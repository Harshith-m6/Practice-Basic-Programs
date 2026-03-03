package com.rc.programs;
import java.util.*;
import java.util.Comparator;

public class Comparator1 {
	int x = 10;
	static int y = 20;

	class DescComp implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return -o1.compareTo(o2);
		}

	}
	static class StrComparator implements Comparator<String>
	{

		@Override
		public int compare(String o1, String o2) {
			return -o1.compareTo(o2);
		}
		
	}
	
	public static void main(String[] args)
	{
		List<Integer> values = Arrays.asList(23,45,56);
		Comparator<Integer> descCom = new Comparator1().new DescComp();
		List<String> names = Arrays.asList("Harshith","Pavan","Abhi");
		Comparator<String> strCom = new Comparator1.StrComparator();
		
		Collections.sort(values , descCom);
		Collections.sort(names , strCom);
		
		System.out.println(values);
		System.out.println(names);
		
		class DoubleComparator implements Comparator<Double>
		{

			@Override
			public int compare(Double o1, Double o2) {
				return -o1.compareTo(o2);
			}
			
		}
		
		List<Double> prices = Arrays.asList(34.55,45.32,12.11,33.33,88.8);
		Comparator<Double> dscComp = new DoubleComparator();
		Collections.sort(prices ,dscComp );
		System.out.println(prices);
		
	}
	
	

}
