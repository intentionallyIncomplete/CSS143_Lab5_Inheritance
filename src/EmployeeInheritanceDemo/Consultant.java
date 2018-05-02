package EmployeeInheritanceDemo;
//inherits the methods from HourlyWorker
public class Consultant extends HourlyWorker {

	//class variables needed?


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
}
