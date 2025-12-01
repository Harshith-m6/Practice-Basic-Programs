package com.rc.programs;

public class RecursionTowerOfHanoi {
	public static void main(String[] args) {
		tw(5,'S','T','D');
	}
	static void tw(int n , char src , char temp , char dst)
	{
		if(n==1)
		{
			System.out.println("Disk 1 move from "+src+" to "+dst);
			return ;
		}
		tw(n-1,src,dst,temp);
		System.out.println("Disk "+n+" move from "+src+" To "+dst);
		tw(n-1,temp,src,dst);
	}
	

}
