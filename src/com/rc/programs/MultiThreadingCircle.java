package com.rc.programs;

public class MultiThreadingCircle{
	static double pi = 3.143;
	double radius ;
	MultiThreadingCircle(double radius)
	{
		this.radius=radius;
	}
	void circleInfo()
	{
		System.out.println("Radius is "+radius);
		double area = pi*radius*radius;
		System.out.println("Area is "+area);
	}

}
