package com.rc.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamApi2 {
	public static void main(String[] args) {
		//List of Integers group all the even integers by doubling
		
		List<Integer> list = Arrays.asList(10,20,33,40,55,60);
		//expected output [20,40,80,120]
		
		List<Integer> elist = new ArrayList<Integer>();
		for(Integer ele : list)
		{
			if(ele%2==0)
			{
				elist.add(ele*2);
			}
		}
		Collections.sort(elist);
		System.out.println(elist);
	}

}
