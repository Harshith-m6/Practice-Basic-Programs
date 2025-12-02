package com.rc.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi3 {
	public static void main(String[] args) {
	//List of Integers group all the even integers by doubling
		
		List<Integer> list = Arrays.asList(10,20,33,40,55,60);
		//expected output [20,40,80,120]
		
		List<Integer> elist = list.stream().filter(ele->ele%2==0).map(ele->ele*2).sorted().collect(Collectors.toList());
		System.out.println(elist);
	}

}
