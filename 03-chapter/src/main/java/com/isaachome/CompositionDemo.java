package com.isaachome;

import java.util.function.Function;

public class CompositionDemo {
	public static void main(String[] args) {
		Function<Double, Double> doubleFunction = x -> x *2;
		
		Function<Double, Double> secondFunction = 
				doubleFunction.compose(x -> -x);
		
		System.out.println(secondFunction.apply(5.0));
	}
}
