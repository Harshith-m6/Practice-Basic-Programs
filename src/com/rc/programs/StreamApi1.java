package com.rc.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi1 {
	public static void main(String[] args) {
		List<Integer> values = List.of(1,2,3,4,5);
		Stream sm = values.stream();
		
		Integer[] ar = {1,2,3,4,5};
		Stream sm1 = Arrays.stream(ar);
		
		Stream sm2 = Stream.of(2,3,4,5,6);
		
		String st = "Raghu";
		IntStream sm3 = st.chars();
	}

}
