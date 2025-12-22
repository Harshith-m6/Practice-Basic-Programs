package com.rc.programs;
import java.util.*;
import java.util.Arrays;

public class ArrayList_1 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,5,6,6,7));
		List<Integer> list1 = new ArrayList<>();
		for(Integer i : list)
		{
			if(!list1.contains(i))
			{
				list1.add(i);
			}
		}
		
		System.out.println(list1);
		
	}

}
