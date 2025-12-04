package com.rc.programs;

import java.util.*;

public class StreamApi9 {
	public static void main(String[] args) {
		List<Employee> emps = List.of(new Employee("Raghu", 45000.0)
				, new Employee("Arun",53000.0)
				, new Employee("Manu" , 60000.0)
				, new Employee("Kiran" , 38000.0));
		
		List<Employee> semp = emps.stream()
//	.sorted(Comparator.comparing(Employee::getSalary))
			.sorted((e1,e2)->Double.compare(e1.salary,e2.salary)).toList();	
		semp.forEach(System.out::println);
	}

}
