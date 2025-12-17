package com.rc.programs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StreamApiNonPrimitive2 {
	public static void main(String[] args) {
		List<Employe> emplist = List.of(new Employe(111,"Harshith","IT",100000.0,23),new Employe(101,"Harshi","IT",10000.0,23),
				new Employe(102,"Pavan","IT",150000.0,21),new Employe(103,"Kushi","HR",50000.0,20),new Employe(104,"Abhi","HR",80000.0,24),new Employe(105,"Moni","IT",90000.0,25));
		
		//sorting the list of employees in decesnding order
		emplist.stream().sorted(Comparator.comparing(Employe::getSal).reversed()).forEach(System.out::println);
		
		
		//prints the name of the employee whos age > 30
		emplist.stream().filter(e->e.getAge()>20).map(e->e.getName()).forEach(System.out::println);
		
		//list all employees who working in IT department
		List<Employe> itemp = emplist.stream().filter(e->e.getDept().equalsIgnoreCase("IT")).toList();
		
		System.out.println(itemp);
		
		List<String> empsIt = emplist.stream().filter(e->e.getDept().equalsIgnoreCase("IT")).map(e->e.getName()).toList();
		
		System.out.println(empsIt);
		
		//find second highest salary in the Employees
		
		String secondHighSal = emplist.stream().sorted(Comparator.comparing(Employe::getSal).reversed()).skip(1).map(e->e.getName()).findFirst().get();
		
		System.out.println(secondHighSal);
		
		Employe secSal = emplist.stream().sorted(Comparator.comparing(Employe::getSal).reversed()).skip(1).findFirst().get();
		
		System.out.println(secSal);
		
		//convert employee object to map (collection) id as key name as value
		
		Map<Integer , String > pair = emplist.stream().collect(Collectors.toMap(e->e.getId(), e->e.getName()));
		
		System.out.println(pair);
		
		
		
		
		
		
		
		
		
		
		
	}

}
