package com.rc.programs;

import java.util.Arrays;
import java.util.List;
import java.util.*;
public class AnonymousImlementation {
	public static void main(String[] args)
	{
		List<Integer> values = Arrays.asList(34,56,78,98,34);
		Comparator<Integer> dsc = new Comparator<Integer>() {
			public int compare(Integer o1 , Integer o2)
			{
				return -o1.compareTo(o2);
			}
		} ;
		Collections.sort(values , dsc);
		System.out.println(values);
	}

}
