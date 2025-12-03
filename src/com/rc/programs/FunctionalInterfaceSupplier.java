package com.rc.programs;
import java.util.function.Supplier;
public class FunctionalInterfaceSupplier {
	public static void main(String[] args) {
		//Supplier is a functional interface it doesnt take any values but returns a value 
		Supplier<String> s1 = new Supplier<String>() {
			@Override
			public String get()
			{
				return "Hello world";
			}
		};
		
		Supplier<String> s2 = ()-> "Hello world";
		
		Supplier<String> s3 = new String("Hello world")::toString;
		
		Supplier<Double> otp = Math::random; 
		
		System.out.println(otp.get());
	}

}
