package com.isaachome;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SortData{
	
	public static void simpleSorted(){
		int [] inums = {3,3,3,6,6,4,5,9,8,10,23,12};
		Arrays.stream(inums)
		.distinct()
		.sorted()
		.forEach(System.out::println);
	}
	
	public static void sortWithComparator() {
		Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c")
		.stream()
		.sorted((o1,o2)->o1.compareTo(o2))
		.forEach(System.out::println);;
	}
	
	public static void sortWithComparatorMethod() {
	List<String> lists =Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c")
		.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
	lists.forEach(System.out::println);
	}
	
	public static void compareAndSort() {
		List<Employee> emplist = Employee.getList();
		emplist.stream()
//		.sorted(Comparator.comparing(Employee::getName))
		.sorted(Comparator.comparingInt(Employee::getAge))
		.forEach(System.out::println);
	}
}
public class StreamSortDemo {
	public static void main(String[] args) {
//		SortData.sortWithComparator();
//		SortData.sortWithComparatorMethod();
		SortData.compareAndSort();
	}
}
