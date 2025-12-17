package com.rc.programs;
import java.util.*;
import java.util.stream.Collectors;
public class StreamNonPrimitive {
	public static void main(String[] args) {
		
		List<Employe> emplist = List.of(new Employe(101,"Harshith","IT",100000.0,23),new Employe(101,"Harshi","IT",10000.0,23),
				new Employe(102,"Pavan","IT",150000.0,21),new Employe(103,"Kushi","HR",50000.0,20),new Employe(104,"Abhi","HR",80000.0,24),new Employe(105,"Moni","IT",90000.0,25));
		
		for(Employe e : emplist) {
			if(e.getSal()>50000)
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		
		emplist.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		emplist.stream().forEach(System.out::println);
		
		System.out.println("Employee details whos salary is more than 50000");
		
		emplist.stream().filter(emp->emp.getSal()>50000).forEach(System.out::println);
		
		
		for(Employe e : emplist)
		{
			System.out.println(e.getName());
		}
		
		
		System.out.println("Printing Employee names using stream");
		emplist.stream().map(emp->emp.getName()).forEach(System.out::println);
		emplist.stream().map(Employe::getName).forEach(System.out::println);
		
		List<String> names = emplist.stream().map(Employe::getName).collect(Collectors.toList());
		
		for(String name : names)
		{
			System.out.println(name+"List element");
		}
				
		
		System.out.println("Group Employees by department wise");
		
		Map<String , List<Employe>> gdpt = emplist.stream().collect(Collectors.groupingBy(Employe::getDept));
		
		gdpt.forEach((k,v)->System.out.println(k+" "+v));
		
		gdpt.forEach((k,v)->System.out.println(k+" = "+v.stream().map(e->e.getName()).toList().toString()));
		
		//grouping Employee by department
		
		Map<String,List<String>> gdept = emplist.stream().collect(Collectors.groupingBy(Employe::getDept,Collectors.mapping(Employe::getName,Collectors.toList() )));
		
		gdept.forEach((k,v)->System.out.println(k+" = "+v));
		
		Map<String,Long> gdt = emplist.stream().collect(Collectors.groupingBy(Employe::getDept,Collectors.counting()));
		
		gdt.forEach((k,v)->System.out.println(k+" = "+v));
		
		//highest salary employee
		
		Employe maxSal = emplist.stream().max(Comparator.comparing(Employe::getSal)).get();
		
		System.out.println(maxSal);
		
		double avg = emplist.stream().collect(Collectors.averagingDouble(Employe::getSal));
		
		System.out.println("Averag salary "+avg);
		
		double average = emplist.stream().mapToDouble(Employe::getSal).sum()/emplist.size();
		
		
		
		System.out.println("avg salary "+average);
		
		double avsal = emplist.stream().mapToDouble(Employe::getSal).reduce(0.0, (a,b)->a+b)/emplist.size();
		
		System.out.println("average salary "+avsal);
		
		Map<String , Double> deptAvg = emplist.stream().collect(Collectors.groupingBy(Employe::getDept,Collectors.averagingDouble(Employe::getSal)));
		
		System.out.println(deptAvg);
	}
	

}
