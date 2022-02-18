package com.isaachome;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamSkipMethodDemo {
	public static void main(String[] args) {
		int[] numbers = {3, 6, 8, 8, 4, 6, 3, 3, 5, 6, 9, 4, 3, 6};
	    IntStream stream = Arrays.stream(numbers);
	    
	    IntSummaryStatistics states = stream
	    		.skip(5).summaryStatistics();
	    System.out.println("Average : " + states.getAverage());
	    System.out.println("Count : " + states.getCount());
	    System.out.println("Min : " + states.getMin());
	    System.out.println("Max : " + states.getMax());
	    System.out.println("Sum : " + states.getSum());
	    }
}
