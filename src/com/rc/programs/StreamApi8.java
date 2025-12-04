package com.rc.programs;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
public class StreamApi8 {
	
	public static void main(String[] args) {
		
		List<Employee> emps = List.of(new Employee("Raghu", 45000.0)
				, new Employee("Arun",53000.0)
				, new Employee("Manu" , 60000.0)
				, new Employee("Kiran" , 38000.0));
		
		Employee highsal = emps.get(0);
		
		for(Employee employee : emps)
		{
			if(employee.salary>highsal.salary)
			{
				highsal=employee;
			}
		}
		
		System.out.println(highsal);
		
		Employee hs = emps.stream().
//				max((e1,e2)->e2.salary>e2.salary?1:-1).
				max(Comparator.comparing(Employee::getSalary)).get();
		
	}

}
