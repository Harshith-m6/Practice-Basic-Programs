package com.rc.programs;
import java.util.*;
public class ArrayList_2 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5));
		
		Set<Integer> set = new HashSet<>(list);
		
		System.out.println(set);
	}

}
