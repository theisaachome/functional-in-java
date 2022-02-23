package com.isaachome;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FlatmapDemo{
	public static void simpleFlatmap(){
		
		// Creating a List of Strings
        List<String> list = Arrays.asList("5.6", "7.4", "4",
                                          "1", "2.3");
        list.stream()
        .flatMap(s->Stream.of(s))
        .forEach(System.out::println);
	}
}
public class StreamFlatMapDemo {
	public static void main(String[] args) {
		FlatmapDemo.simpleFlatmap();
	}
}
