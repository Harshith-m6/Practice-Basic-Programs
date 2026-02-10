package com.rc.programs;
import java.util.*;
public class GCDnum {
	public static void main(String[] args) {
		int a = 25;
		int b = 10;
		
		while(b!=0)
		{
			int temp=b;
			b=a%b;
			a=temp;
		}
		
		System.out.println(a);
		
	}

}
