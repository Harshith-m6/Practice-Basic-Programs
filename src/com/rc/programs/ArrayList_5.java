package com.rc.programs;
import java.util.*;
public class ArrayList_5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4,1,5,6));
		
		ListIterator<Integer> it = list.listIterator();
		while(it.hasNext())
		{
			it.next();
			it.remove();
		}
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		System.out.println(list1);
	}

}
