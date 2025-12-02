package com.rc.programs;

public class Student extends Person{
	
	int id ;
	String name;
	
	Student()
	{
		this(99.00);
		
	}
	Student(double per)
	{
		this(101);
		System.out.println("percentage scored is "+per);
	}
	Student(int id)
	{
		this.id = id;
		System.out.println("Age of the student is "+age);	}

}
