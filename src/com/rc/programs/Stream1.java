package com.rc.programs;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream1 {
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7);
		list.stream().filter(a->a%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
