package com.rc.programs;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the login time of the new employee");
		int t = sc.nextInt();
		int[] ts = {11,12,1,3,4,5,6,9,8,7};
		int emps = count(ts,t);
		System.out.println("no of employees before the particular employee is "+emps);
		
	}
	
	static int count(int[] emps , int emp)
	{
		int count=0;
		Arrays.sort(emps);
		for(int i =0 ; i<emps.length ; i++)
		{
			
			if(emps[i]>=emp)
			break;
			count++;
			
			
		}
		return count;
	}

}
