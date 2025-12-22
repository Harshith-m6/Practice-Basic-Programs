package com.rc.programs;
import java.util.*;
public class LinkedList1 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list  = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(4);
		System.out.println(list);
		
		list.addFirst(0);
		list.addLast(5);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
		
			if(it.next()%2==0)
			{
				it.remove();
			}
		}
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list.peekFirst());
//		System.out.println(list.peekLast());
//		System.out.println(list.remove(1));
		System.out.println(list.poll());
		
	}

}
