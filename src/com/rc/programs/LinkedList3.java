package com.rc.programs;
import java.util.*;
public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,3,5));
		LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2,4,6));
		
		List<Integer> result = new LinkedList<>();
		
		while(!list1.isEmpty() && !list2.isEmpty())
		{
			result.add(list1.peek()<list2.peek()?list1.poll():list2.poll());
		}
		
		result.addAll(list1);
		result.addAll(list2);
		
		System.out.println(result);
	}

}
