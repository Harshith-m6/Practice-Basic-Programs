package com.rc.programs;
import java.util.List;
import java.util.function.*;
public class FunctionalInterfaceConsumer {

	public static void main(String[] args) {
		Consumer<String> cs1 = new Consumer<String>()
				{
			@Override
			public void accept(String str)
			{
				System.out.println(str);
			}
				};
				
				Consumer<String> cs2 = (str) -> System.out.println(str);
				
				Consumer<String> cs3 = System.out::println;
				
				List<String> list = List.of("Harshith", "Pavan" , "abhi");
				//forEach(Consumer) internally has accept method which has for-each loop
				
				list.forEach(cs3);
				
				list.forEach(System.out::println);
	}
}
