package com.highway65;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		String data= "Java 8 functional interface";
		Supplier<Boolean> boolSupplier= ()->data.length()==10;
		Supplier<Integer> intSupplier = ()->data.length() - 2;
		Supplier<String> stringSupplier = ()->data.toLowerCase();
		
		System.out.println(boolSupplier.get());
	}
}
