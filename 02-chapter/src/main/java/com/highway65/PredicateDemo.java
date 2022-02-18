package com.highway65;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<String> p=(x)->x.length() > 5;
		Predicate<Integer> isGreater = (a)-> a>30;
		System.out.println(p.test("Hello_World."));
		List<Integer> iList = Arrays.asList(10,20,30,40,50,60,70);
		iList.stream()
		.forEach(s->System.out.println(isGreater.test(s)));
	}
}
