package com.java.core.interview;

import java.util.*;
import java.util.stream.*;

public class EmployeeManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = List.of(
				new Employee(101,"Jack"),
				new Employee(100,"Alex"),
				new Employee(100,"Alex"),
				new Employee(102,"Chandler"),
				new Employee(103,"Joey"),
				new Employee(103,"Ross")
		);
		
		Set<Employee> set = empList.stream()
	            .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Employee::getEmpId))));
		System.out.println(set);
		
		//average empID
		System.out.println("average:"+empList.stream().mapToInt(e->e.getEmpId()).average().getAsDouble());
		
		//sum of empID
		System.out.println("sum:"+empList.stream().mapToInt(e->e.getEmpId()).sum());
		
		
		System.out.println(empList.stream().map(e-> e.getEmpName()).collect(Collectors.toList()));
		
		
		Stream<String> names = empList.stream().map(e-> e.getEmpName());
		
		Stream<Employee> filteredEmps = empList.stream().filter(e-> e.getEmpName().toUpperCase().indexOf("A") == 0);
		
		
		
	}

}
