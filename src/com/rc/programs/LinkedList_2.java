package com.rc.programs;
import java.util.*;
public class LinkedList_2 {
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>(Arrays.asList(1,2,2,1,2,3,4,5,6));
		
		list.removeIf(i->i==2);
		System.out.println(list);
		
		List<Integer> list1 = new LinkedList<>(Arrays.asList(3,6,7,8,9));
		
		List<Integer> merged = new LinkedList<>(list);
		merged.addAll(list1);
		
		System.out.println(merged);
		
	}

}
