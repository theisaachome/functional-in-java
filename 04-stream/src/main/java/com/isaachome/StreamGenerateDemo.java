package com.isaachome;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamGenerateDemo {
	static int num =0;
	public static int nextInt() {
		return num++;
	}
	public static void main(String[] args) {
		
		Stream.generate(()->nextInt())
		.limit(5)
		.forEach(System.out::println);
		
		Supplier<Double> doubleRandom = Math::random;
		Stream.generate(doubleRandom)
		.limit(5)
		.forEach(System.out::println);
	}
}
