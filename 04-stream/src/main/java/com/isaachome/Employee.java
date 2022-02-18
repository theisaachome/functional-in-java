package com.isaachome;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private String name;
	private String email;
	private String address;
	private int age;
	
	public Employee(String name, String email, String address, int age) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}
	
	public static List<Employee> getList(){
		return Arrays.asList(
				new Employee("Aung Aung", "aung@gmail.com", "Yangon", 20),
				new Employee("Maw Maw", "maw@gmail.com", "Mdy", 21),
				new Employee("Thaw Thaw", "thawthaw@gmail.com", "Yangon", 22),
				new Employee("Kyaw Kyaw", "kyawkyaw@gmail.com", "NewYork", 19),
				new Employee("Thidar Aung", "thidaraung@gmail.com", "Mdy", 24));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Employee : %s %s %s %d\n", name,email,address,age);
	}
	
}
