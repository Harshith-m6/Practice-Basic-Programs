package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class Stream2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,8,7,6,54,3);
		list.stream().filter(n->n>5&&n%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
