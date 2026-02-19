package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class Stream6 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,8,9,8,9,8,7,6,5,6,7);
		List<Integer> lists =list.stream().distinct().collect(Collectors.toList());
		System.out.println(lists);
	}

}
