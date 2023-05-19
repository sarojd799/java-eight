package com.java.core.collection;

import java.util.*;
import java.util.stream.Collectors;

import com.java.core.interview.Employee;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee(101, "Alex");
		Employee e1 = new Employee(104, "Joseph");
		Employee e2 = new Employee(103, "Anna");
		Employee e3 = new Employee(102, "Mathew");
		Map<Employee, String>  m1 = new HashMap<Employee, String>();
		m1.put(e, "a");
		m1.put(e1, "a");
		m1.put(e2, "a");
		m1.put(e3, "a");
		System.out.println(m1);
		
		System.out.println("\n");
		
		//sorting of list
		List<Employee> l = new ArrayList<Employee>();
		l.add(e3);
		l.add(e2);
		l.add(e);
		l.add(e1);
		l.stream().sorted(Comparator.comparing(Employee::getEmpId)).forEach(System.out::println);    
		
		System.out.println("\n");
		
		//Sorting of map
		System.out.println(m1.entrySet().stream()
				.sorted((emp1,emp2)-> emp1.getKey().getEmpId() - emp2.getKey().getEmpId())
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
		
		
	}

}
