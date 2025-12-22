package com.rc.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5));
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
