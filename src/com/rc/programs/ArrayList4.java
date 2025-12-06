package com.rc.programs;
import java.util.*;
public class ArrayList4 {
	
	//Rotate list by k
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList(Arrays.asList(1,9,8,7,2));
		int k = 3;
		k=k%nums.size();
		
		ArrayList<Integer> temp = new ArrayList<>(nums.subList(0, k));
		
		nums.subList(0, k).clear();
		nums.addAll(temp);
		
		System.out.println(nums);
		
		
	}

}
