package com.rc.programs;

public class Person {
	String name;
	int age;
	
	Person()
	{
		this("Harshith");
	}
	
	Person(String name)
	{
		this(23);
		this.name = name;
		System.out.println("Name is "+this.name);

	}
	Person(int age)
	{
		this.age=age;
		System.out.println("Student age "+this.age);
	}
	

}
