package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class Stream3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("harshith","abhi","pavan");
		List<String> upper = list.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(upper);
		
		List<Integer> lengths = list.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(lengths);
	}

}
