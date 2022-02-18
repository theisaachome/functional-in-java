package com.isaachome;

import java.util.List;


public class StreamFilterMethodDemo {
	
	
	public static void main(String[] args) {
		List<Employee> empList = Employee.getList();
		empList.stream()
		.filter((e)->e.getAge()>20)
		.forEach(System.out::println);
		
				
	}
}
