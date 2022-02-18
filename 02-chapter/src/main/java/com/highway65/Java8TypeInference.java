package com.highway65;

interface Concatenation<T>{
	public String concatenate(T u,T v);
}
public class Java8TypeInference {
	public static void main(String[] args) {
		Concatenation<String> string=(a,b)-> a +" : " + b;
		
		Concatenation<Integer> integer = (a,b)->a + " : " +b;
		System.out.println(string.concatenate("Cat", "Dog"));
		System.out.println(integer.concatenate(100, 200));
	}
}
