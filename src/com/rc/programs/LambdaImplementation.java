package com.rc.programs;
import java.util.*;
public class LambdaImplementation {
	public static void main(String[] args) {
		Comparator<String> strComp = (o1 , o2)-> Integer.compare(o1.length(), o2.length());
		
		Comparable<Integer> compa = (x)-> x.hashCode();
		Runnable myrun=() -> {
			for(int i=1 ; i<=10; i++)
			{
				System.out.println(2+" * "+" = "+(2*i));
			}
		};
		
	}

}
