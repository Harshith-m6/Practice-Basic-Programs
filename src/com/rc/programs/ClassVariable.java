package com.rc.programs;

public class ClassVariable {
	// class variable is known as Static variable
	public static int count;
	public ClassVariable()
	{
		count++;
	}
	public static void main(String[] args) {
		ClassVariable c1 = new ClassVariable();
		System.out.println(count);
		ClassVariable c2 = new ClassVariable();
		ClassVariable c3 = new ClassVariable();
		System.out.println("Number of instance created "+count);

	}

}
