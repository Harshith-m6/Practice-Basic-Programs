package com.rc.programs;

public class RecursionPower1 {
	
	int power(int base , int pow)
	{
		if(pow==0)
		{
			return 1;
		}
		
		return base*power(base,pow-1);
		
	}

}
