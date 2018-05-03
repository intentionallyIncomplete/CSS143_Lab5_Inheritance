package EmployeeInheritanceDemo;

/****************************************************/
/* Questions from the Lab answered here				*/
/* 1) Any method that is left with an access modifier*/ 
/* of public will be polymorphic(?) to the Employee	*/
/* Hierarchy. That is, that while the access modifier*/
/* is public or left default (which is public)		*/
/* any subclass or derived class may access it.		*/
/* 2) the getRandInt() method could be implemented	*/
/* here if the employees salary was random or if we	*/
/* had a hiring spree and needed to assign people an*/
/* ID and wanted random numbers to get their new ID	*/
/* 3) */
/****************************************************/

public class Consultant extends HourlyWorker {

	//class variables
	private double hoursWorked;

	/****************************************************/
	/* Ctor's here. 									*/
	/* First ctor is private and will not allow the 	*/
	/* construction of the object in this way.			*/
	/* the second is the 2-arg (generic) ctor to make a */
	/* basic Consultant.								*/
	/* the last ctor will build a Consultant that may be*/
	/* above MINIMUM_WAGE. 								*/
	/****************************************************/


	private Consultant(){
		//invalid construction of object
		//will show error when attempting
		//to construct object from driver this way
	} 

	public Consultant(String name, int social){
		super(name, social, MINIMUM_WAGE);
	}
	
	public Consultant(String name, int social, int hourlyPay){
		super(name, social, hourlyPay);
	}

	public Consultant(String name, int social, int hourlyPay, double hoursWorked){
		super(name, social, hourlyPay);
		this.hoursWorked = calculateWeeklyPay(hoursWorked);
	} 
	
	public double calculateWeeklyPay(double hoursWorked){
		return hoursWorked * 3;
	}
}
