package com.rc.programs;

public class RecursionCountSettedBits {
	
	int countBits(int n)
	{
		if(n==0)
			return 0;
		return (n%2)+countBits(n/2);
	}

}
