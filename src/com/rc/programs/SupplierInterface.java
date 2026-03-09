package com.rc.programs;

import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
		Supplier<String> mySup = new Supplier<String>() {

			@Override
			public String get() {
				return this.getClass().getPackageName();
			}
			
		};
		
		System.out.println(mySup.get());
		
		Supplier<Integer> mySup1 = new Supplier<Integer>() {

			@Override
			public Integer get() {
				return new String("Harshith").hashCode();
			}
			
		};
		
		System.out.println(mySup1.get());
	}

}
