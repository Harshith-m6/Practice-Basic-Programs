package com.rc.programs;
import java.util.*;
public class ArrayList8 {
	//moves zero to end
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,1,1,0,0,0,3,4,5));
		ArrayList<Integer> result = new ArrayList<>();
		
		for(Integer x : a1)
		{
			if(x!=0)
			{
				result.add(x);
			}
		}
		
		for(Integer x : a1)
		{
			if(x==0)
			{
				result.add(x);
			}
		}
		
		System.out.println(result+"  zero at right end");
		
		ArrayList<Integer> result1 = new ArrayList<>();

		for(Integer x : a1)
		{
			if(x==0)
			{
				result1.add(x);
			}
		}
		
		for(Integer x : a1)
		{
			if(x!=0)
			{
				result1.add(x);
			}
		}
		System.out.println(result1+" zer0 at left ");
	}

}
