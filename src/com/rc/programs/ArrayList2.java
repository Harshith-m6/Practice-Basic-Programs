package com.rc.programs;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList(Arrays.asList(1,2,3,2,1,4));
		
		int remove = 2;
		a.removeIf(n-> n==remove);
		
		System.out.println(a);
		
	}

}
