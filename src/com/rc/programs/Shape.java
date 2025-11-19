package com.rc.programs;

import java.util.List;

public interface Shape {
	
	double getArea();
	
	static Shape getBiggestAreaShape(List<Shape> shapes)
	{
		Shape big = shapes.get(0);
		for(int i =1 ; i<shapes.size() ; i++)
		{
			if(shapes.get(i).getArea()>big.getArea())
			{
				big=shapes.get(i);
			}
		}
		return big;

	}

}
