package com.rc.programs;
import java.util.*;
public class ArraysToList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		
		List<Integer> list2 = List.of(1,2,1,2,1,1);
		
		int[] arr = {8,4,1,2,6,8,4,3,2,9,0};
		
		
		List<Integer> list3 = new ArrayList<>();
		for(int a : arr)
		{
		list3.add(a);
		}
		
		
		//sort the List
		
//		Collections.sort(list3);
//		System.out.println(list3);
//		Collections.reverse(list3);
//		System.out.println(list3);
		
		Comparator<Integer> com = new MyComparator();
		Collections.sort(list1, com);
		
		}

}
