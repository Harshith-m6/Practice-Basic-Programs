package com.rc.programs;
import java.util.*;
public class ArrayTwoSum {
	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,4,3};
		int target = 11;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i =0 ; i<arr.length;i++)
		{
			int com = target - arr[i];
			if(map.containsKey(com))
			{
				System.out.println("indexes: "+map.get(com)+","+i);
				return;
			}
			map.put(arr[i], i);
		}
	}

}
