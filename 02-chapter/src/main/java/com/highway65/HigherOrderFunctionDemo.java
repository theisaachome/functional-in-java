package com.highway65;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class StringUtils{
	public static String processString(Function<String, String> operation,
			String target) {
		return operation.apply(target);
	}
}
public class HigherOrderFunctionDemo {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aung Aung","Naw Naw","Aung La");
		for (String s : names) {
			System.out.println(s.toLowerCase());
		}
		names.forEach(s->System.out.println(
				StringUtils.processString(t->t.toUpperCase(), s)
				));
		names.forEach(s->System.out.println(
				StringUtils.processString(String::toLowerCase, s)));
	}
}
