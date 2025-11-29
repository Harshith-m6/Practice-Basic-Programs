package com.rc.programs;

import java.util.Arrays;

public class ArrayRemoveDuplicates2 {
	public static void main(String[] args) {
		int[] a = {1,3,2,4,2,1,4,5,6,6,4,7};
		boolean[] x = new boolean[100]; // assume values<100 default values will be false in the boolean array
		int[] temp = new int[a.length];
		int index =0;
		for(int y : a)
		{
			if(!x[y])
			{
				x[y]=true; // the index of particular element is set to true 
				temp[index++]=y;
			}
		}
		
		int[] result = Arrays.copyOf(temp, index);
		for(int w:result)
		{
			System.out.println(w);
		}
	}

}
