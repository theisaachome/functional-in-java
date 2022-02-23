package com.isaachome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MapDemo{
	public static void simpleMap() {
		Employee.getList()
		.stream()
		.map(e->e.getName().toUpperCase())
		.forEach(System.out::println);
		
		
	}
	public static void sample2() {
		Employee.getList()
		.stream()
		.map(e->e.getAge()*2)
		.forEach(System.out::println);;
	}
	public static void sample3() {
		int total =Employee.getList()
		.stream()
		.map(e->e.getAge()*2)
		.reduce(0,(r,s)-> r+s);
		System.out.println(total);
	}
}
public class StreamMapDemo {
	public static void main(String[] args) {
//		MapDemo.simpleMap();
		MapDemo.sample3();
	}
}
