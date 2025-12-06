package com.rc.programs;
import java.util.*;
public class ArrayList6 {
	//merge two arraylist
	
	public static void main(String[] args) {
		//using set
		ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,3,1,1,4,5,6,6));
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(7,8,9,0));
		
		Set<Integer> s1 = new LinkedHashSet<>();
		
		s1.addAll(num1);
		s1.addAll(num2);
		
		System.out.println(s1);
		
		


	}

}
