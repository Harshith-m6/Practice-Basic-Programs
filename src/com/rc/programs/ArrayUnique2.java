package com.rc.programs;
import java.util.*;
public class ArrayUnique2 {
	public static void main(String[] args) {
		int[] ar = {5,6,7,6,5};
		List<Integer> values = new ArrayList<Integer>();
		for(Integer ele : ar)
		{
			if(values.contains(ele))
			{
				values.remove(ele);
			}else
				values.add(ele);
		}
		System.out.println(values.get(0));
	}

}
