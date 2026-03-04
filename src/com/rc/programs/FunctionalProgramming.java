package com.rc.programs;

import java.util.function.Consumer;

public class FunctionalProgramming {
	class MyOperations{
		void disp(int x)
		{
			System.out.println("displaying "+x);
		}
		
		void write(String y)
		{
			System.out.println("Writing "+y);
		}
	}
	
	public static void main(String[] args) {
		MyOperations my = new FunctionalProgramming().new MyOperations();
		Consumer<Integer> cons1 = my::disp;
		cons1.accept(1);
		
		Consumer<String> cons2 = my::write;
		cons2.accept("Harshith");
		
		Consumer<String> cons3 = new FunctionalProgramming().new MyOperations()::write;
		cons3.accept("Pavan");
		
		Consumer<Integer> con4 = System.out::println;
		con4.accept(0X4);
		con4.accept(076);
		con4.accept(0b110);
		con4.accept(76);
		
	}

}
