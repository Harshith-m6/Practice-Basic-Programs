package com.rc.programs;

public class Rectangle implements Shape{
	
	double length;
	double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public double getArea() {
		return length * width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width  + "  area : "+getArea() + "]";
	}
	
	
	

}
