package EmployeeInheritanceDemo;

import java.util.ArrayList;
/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */

public class EmployeeDriver {
	
	
	public static void main(String[] args) {
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);
		
		//todo: Build some PermanentHire and Consultant objects here
		//and add them to the ArrayList below
		
		PermanentHire emp6 = new PermanentHire("Shaw", 12838472); //uses two arg ctor of PermanentHire class
		PermanentHire emp7 = new PermanentHire("Harold", 1244124112, 25000); //uses three arg ctor of PermanentHire class
		//PermanentHire emp11 = new PermanentHire("Finch", 1244124112, 25000, 1000);
		
		//Consultant emp8 = new Consultant("Reese", 12123123);
		//Consultant emp9 = new Consultant("Root", 0110012313, 25000);
		
		
		//and build a set of workers, all of which are employees
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		//todo: add a sixth and seventh employee to this list that you create
		myEmployees.add(emp6);
		myEmployees.add(emp7);
		//myEmployees.add(emp8);
		//myEmployees.add(emp9);
		//myEmployees.add(emp11);
		
		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
			System.out.println(current.getName() + " makes " + current.calculateDailyPay() + " per day.");
		}
	}
}
