package com.rc.programs;

public class MultiThreading2 {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		MultiThreadingCircle c1 = new MultiThreadingCircle(5.9);
		MultiThreadingCircle c2 = new MultiThreadingCircle(11.0);
		
		c1.circleInfo();
		System.out.println("-----------------");
		c2.circleInfo();
		
		System.out.println("Main method ended");
	}
	
	/* 1st compilation happens - two .class files are generated 
	 * MultiThreadingCircle.class and MultiThreading2.class (byte code generation)
	 * jvm divides main memory into 3 parts , stack area , heap area and class area
	 * jvm is loads into stack area 
	 * jvm calls the classLoader into load the class are into class area
	 * in class area the memory allocation to the static members takes place
	 * after this jvm calls the main mathod
	 * main method is loaded into stack area
	 * controller points to the main method , main method starts executes
	 * here new circle(); new circle object is created in the heap area
	 * after the object is created for non static members memory is assigned in the heap area
	 * c1.circleInfo method will be loaded into stack area and execution takes place
	 * c2.circleInfo method will be loaded into stack area (properties will be loaded according to the reference )
	 * (stack area - actual execution takes place - no matter static or non static methods - they loades into stack area for the execution)
	 * */

}
