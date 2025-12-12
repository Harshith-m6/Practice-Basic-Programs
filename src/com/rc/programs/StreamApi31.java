package com.rc.programs;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi31 {
	//count the duplicates in the array using stream
	public static void main(String[] args) {
		List<Integer> values = List.of(1,2,1,2,3,4,4,3);
		
		Map<Integer , Long> freq = values.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		Map<Integer,Long> dupl = freq.entrySet().stream().filter(en->en.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println("frquency is "+freq);
		
		System.out.println("Duplicate is "+dupl);
		
		for(Map.Entry<Integer, Long> en : freq.entrySet())
		{
			if(en.getValue()>1)
			{
				System.out.println(en);
			}
		}
	}

}
