package com.rc.programs;

public class RecursionDecimalToBinary {
	
	String binary(int n)
	{
		if(n==0||n==1)
			return ""+1;
		return binary(n/2)+n%2;
	}

}
