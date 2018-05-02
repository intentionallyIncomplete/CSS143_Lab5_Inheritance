package EmployeeInheritanceDemo;

/*
 * SalariedWorker.java
 * This worker calculates her weekly pay differently than a hourly worker does, so we override the calculateWeeklyPay method
 */

public class SalariedWorker extends Employee {
	private double monthlyPay;
	
	public SalariedWorker() {
		super();
	}
	
	//this ctor will simply assign the name and social sec ##
	//to the new type of employee object being created
	//using this as its parent class. 
	public SalariedWorker(String name, int social) {
		super(name, social);
	}
	
	
	public SalariedWorker(String name, int social, double pay) {
		super(name, social);
		
		//the variable 'pay' here stands in for the value 
		//that was given in the list of args in EmployeeDriver
		//when creating a new SalariedWorker object
		//if the pay value was over 0, set the new passed value
		//as the pay value for the object being created using 
		//this class as its parent.
		if( pay > 0.0) {
			monthlyPay = pay;
		}
	}
	
	public double calculateWeeklyPay() {
		return monthlyPay/4;
	}
	
	//new method for calculating daily pay
	public double calculateDailyPay(){
		return monthlyPay/28;
	}
}
