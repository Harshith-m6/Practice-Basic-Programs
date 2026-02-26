package com.rc.programs;
import java.util.*;
public class ComparatorSortString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Harshith","Abhi","Pavan","Adish","Prajju");
		
		Comparator<String> strLen = new LengthComparator();
		Collections.sort(list,strLen);
		System.out.println(list);
		
		Comparator<String> str = new StringComparator();
		Collections.sort(list, str);
		System.out.println(list);
	}

}
