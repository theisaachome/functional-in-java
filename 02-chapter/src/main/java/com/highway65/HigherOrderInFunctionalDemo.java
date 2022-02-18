
package com.highway65;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class NumberUtil{
	public static void ex1() {
		List<String> numString = Arrays.asList("10","20","30","40","50");
		List<Integer> numbers = new ArrayList<Integer>();
		Function<List<String>, List<Integer>> numFunction = s->{
			s.stream()
			.forEach(
				n->numbers.add(Integer.valueOf(n))
			);
			return numbers;
		};
		
		System.out.println(numFunction.apply(numString));
	}
	public static void ex2() {
		List<String> numString = Arrays.asList("10","20","30","40","50");

		List<Integer> numbers = new ArrayList<Integer>();
		Function<List<String>, List<Integer>> twiceFunction =s->{
			s.stream()
			.forEach(n->numbers.add(Integer.valueOf(n)*2));
			return numbers;
		};
		Arrays.asList(numString)
			.stream()
			.map(twiceFunction)
			.forEach(s->System.out.println(s));
	}
}
public class HigherOrderInFunctionalDemo {
	public static void main(String[] args) {
		NumberUtil.ex2();
		
	}

}
