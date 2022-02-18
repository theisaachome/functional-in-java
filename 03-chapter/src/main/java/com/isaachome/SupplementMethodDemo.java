package com.isaachome;

import java.util.function.Function;

class Customer{
	private String email;
	public Customer(String email){
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
class Saleman{
	private Customer bestCustomer;
	private Manager manager;
	public Saleman(Customer bestCustomer,Manager manager) {
		this.bestCustomer = bestCustomer;
		this.manager = manager;
	}
	public Customer getBestCustomer() {
		return bestCustomer;
	}
	public void setBestCustomer(Customer bestCustomer) {
		this.bestCustomer = bestCustomer;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	
}
class Manager{
	private String email;
	public Manager(String email) {
		this.email =email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class SupplementMethodDemo {
	public static void main(String[] args) {
		Customer customer = new Customer("bestcustomer@gmail.com");
		Manager manager = new Manager("manager@thecompany.com");
		Saleman saleman = new Saleman(customer,manager);
		
			Function<Customer, String> customerToEmail = Customer::getEmail;
			Function<Saleman,Customer> saleToCustomer = Saleman::getBestCustomer;
			Function<Saleman, String> toEmailAddress =
					saleToCustomer.andThen(Customer::getEmail);
			
			Function<Manager,String> managerToEmail=Manager::getEmail;
			Function<Saleman,Manager> salemanToManager=Saleman::getManager;
			
			Function<Saleman, String> toManagerEmail = salemanToManager.andThen(Manager::getEmail);
			
			processEmailAddress(saleman, toEmailAddress);
			processEmailAddress(saleman, toManagerEmail);
	}
	
	public static void processEmailAddress(Saleman saleman,Function<Saleman, String> toEmailAddress) {
		
		System.out.println("Email Address : " + toEmailAddress.apply(saleman));
	}
}
