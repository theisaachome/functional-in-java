package com.isaachome;

import java.util.Arrays;
import java.util.stream.IntStream;


public class StreamDemo {
	public static void main(String[] args) {
		int [] inums =  {3,6,8,8,4,6,3,3,5,6,9,4,3,6};
		IntStream iStream = Arrays.stream(inums);
		iStream.forEach(System.out::println);
		int totalSum = Arrays.stream(inums)
				.distinct()
				.sum();
		System.out.println(totalSum);
	}
}
