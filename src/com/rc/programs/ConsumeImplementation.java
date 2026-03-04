package com.rc.programs;
import java.util.*;
import java.util.function.Consumer;
public class ConsumeImplementation {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,4,3,4,5,6);
		Consumer<Integer> consum = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
			System.out.println("Hi "+t);
				
			}
			
		};
		
		values.forEach(consum);

		Consumer<Integer> dConsum = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Double of "+t+" is "+t*2);
			}
			
		};
		values.forEach(dConsum);
	}
	
	

}
