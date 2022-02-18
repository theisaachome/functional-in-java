package com.highway65;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CurryingDemo {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction=(a,b)->a+b;
		System.out.println(biFunction.apply("Cat", "Dog"));
		
		Function<String, Function<String, String>> curryConcat =
				a->(b)->biFunction.apply(b, a);
	}
}
