package EmployeeInheritanceDemo;

/****************************************************/
/* PermanentHire class inherits the methods from 	*/
/* SalariedWorker and uses the ctor from that class */
/* to set the name and social sec # for the new hire*/
/* This employee makse 10k monthly. 				*/
/****************************************************/

public class PermanentHire extends SalariedWorker{

	//class variables here
	public static final double PERM_HIRE_MONTHLY = 10000; //makes 10k monthly for permanent hires. 
	
	/****************************************************/
	/* ctor's here. These are similar to the Accountant */
	/* class in that that use the super ctor of			*/
	/* SalariedWorker for the name and social security	*/
	/* numbers.	the first ctor here will simply take in	*/
	/* the name and social sec ## values passed in 		*/
	/* through the EmployeeDriver class statements, then*/
	/* assign them to the name and social of the new emp*/
	/****************************************************/
	//2-arg ctor
	public PermanentHire(String name, int social){
		super(name, social, PERM_HIRE_MONTHLY);
	}
	
	//3-arg ctor
	public PermanentHire(String name, int social, int monthlyPay){
		super(name, social, monthlyPay);
	}
}
