package com.rc.programs;

import java.util.*;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList(Arrays.asList(1,9,8,7,2));
		
		TreeSet<Integer> num = new TreeSet<>(nums);
		
		System.out.println("Highest "+num.pollLast()); // removes the Last element from the TreeSet and returns it , or returns null for empty TreeSet
		
		System.out.println("Second Highest "+num.pollLast());
		
	}

}
