package com.rc.programs;

public class RecursionCountEvenDigits {
	
	int countEvenDigits(int n)
	{
		if(n>=-9 && n<=9)
		{
			return n%2==0?1:0;
		}
		
		return (n%10%2==0?1:0)+countEvenDigits(n/10);
	}

}
