package com.highway65;

import java.util.Arrays;
import java.util.function.BiFunction;

enum EMPLOYEE_TYPE {
	Hourly,
	Salary,
	Sales
}
class EmployeeService{
	public  static BiFunction<Integer, Float, Float> calculatePay(EMPLOYEE_TYPE emType){
		
		switch (emType) {
		case Hourly :return (hour,payRate) -> hour * payRate;
		case Salary : return (hour,payRate)->40 * payRate;
		case Sales:return (hour,payRate)-> 500f * 0.15f * payRate;
		default:
			return null;
		}
	}
}
public class ReturnFunctionDemo {
	public static void main(String[] args) {
		int [] hoursOfWorks = {8,12,8,6,6,5,6,0};
		int totalHoursOfWorks= Arrays.stream(hoursOfWorks).sum();
		var result =EmployeeService.calculatePay(EMPLOYEE_TYPE.Salary)
				.apply(totalHoursOfWorks, 15.0f);
		System.out.println(result);
	}

}
