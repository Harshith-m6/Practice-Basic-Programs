package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamApi28 {
	//no  of  character in the word
	public static void main(String[] args) {
		String str = "God Created Human";
		Map<String , Integer> wordFreq = Arrays.stream(str.split(" ")).collect(Collectors.toMap(st->st,st->st.length()));
		
		System.out.println(wordFreq);
	}

}
