package com.rc.programs;

public class FunctionalinterfaceMain {
	public static void main(String[] args) {
		Comparable<Integer> c1 = new FunctionalInterface1();
		
		Comparable<Integer>  c2 = new Comparable<Integer>()
				{
			@Override
			public int compareTo(Integer i1)
			{
				return i1.compareTo(this.hashCode());
						
			}
				};
				
				Comparable<Integer> c3 = i1 ->i1.compareTo(8);
				
				Comparable<Integer> c4 = new Integer(10)::compareTo;
				//::Scope Resolution Operator
				
				Comparable<String> c5 = new String()::compareTo;
	}

}
