package com.rc.programs;
import java.util.*;
public class ArrayList7 {
	//Common elements between two arraylist
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,3,5,6,2,4));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(9,8,5,6,2,7));
		
		ArrayList<Integer> common = new ArrayList<>();
		
		for (Integer x : a1)
		{
			if(a2.contains(x)) {
				common.add(x);
			}
		}
		
		System.out.println(common);

	}

}
