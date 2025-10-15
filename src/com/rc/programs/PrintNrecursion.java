package com.rc.programs;
import java.util.Scanner;


public class PrintNrecursion {
	public static void print(int i)
	{
		
		if(i>100)
		{
			return;
		}else {
			System.out.println(i);
			print(i+1);
		}
	}
	
	public static void main(String[] args) {
	
		print(1);
	}
	

}
