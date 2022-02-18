package com.isaachome;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamInfiniteDemo {

	public static void main(String[] args) {
		IntStream.iterate(0, n->n+1)
		.limit(10)
		.forEach(System.out::println);
		
		String [] subjects = {"Cat","Dog","monkey","bat"};
		String [] verbs = {"chased","ate","lost","swatted"};
		String [] object = {"ball","rat","donughnut","tamale"};
		Random random = new Random();
		
		Stream.iterate("", 
				m -> subjects[random.nextInt(subjects.length)]
				+ " " + verbs[random.nextInt(3)]
				+ " " + object[random.nextInt(object.length)])
		.limit(5)
		.forEach(System.out::println);
		
	}
}	
