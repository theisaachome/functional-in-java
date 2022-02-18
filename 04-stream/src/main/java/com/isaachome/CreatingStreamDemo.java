package com.isaachome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamDemo {
	public static void main(String[] args) {
		
		
		
		Stream<Employee> eStream= Employee.getList().stream();
		
		eStream.forEach(e->System.out.println(e.getName()));
		
		List<String> cities = new ArrayList<String>();
		cities.add("London");
		cities.add("NewYork");
		cities.add("Liverpool");
		cities.add("Aston Villa");
		cities.stream().forEach(System.out::println);
	}
}
