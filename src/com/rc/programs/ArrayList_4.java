package com.rc.programs;
import java.util.*;
public class ArrayList_4 {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		for(int i =0 ; i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		for(Integer i : list)
		{
			System.out.print(i+" ");
		}
	}

}
