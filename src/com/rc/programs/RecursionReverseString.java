package com.rc.programs;

public class RecursionReverseString {
	
	static String reverse(char[] ch,int start , int end) {
		if(start>=end)
		
			return new String(ch);
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			return reverse(ch , start+1 , end-1);
		
	}
	
	
	public static void main(String[] args) {
		String a = "Harshith";
		reverse(a);
	}

}
