package com.rc.programs;

import java.util.List;

public class BiggestShape {
	public static void main(String[] args) {
		List<Shape> shapes = List.of(new Circle(3.00) , new Square(4.0) , new Rectangle(2.0,3.0), new Circle(4.0));
		System.out.println("  List of Shapes  ");
		for(Shape sh : shapes)
		{
			System.out.println(sh);
		}
		
		Shape bigShape = Shape.getBiggestAreaShape(shapes);
		System.out.println("Biggest Area Shape is :");
		System.out.println(bigShape);
	}
	
	
	

}
