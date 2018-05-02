package ColorInheritanceDemo;

/****************************************************/
/* This class inherits all the public methods from	*/
/* it's parent class, SimpleColor. This class will	*/
/* allow the user to be able to set a transparency	*/
/****************************************************/

public class ColorWithAlpha extends SimpleColor{

	int alpha;

	/****************************************************/
	/*						Getters						*/
	/****************************************************/
	//return the copy of the variable
	public int getAlpha(){
		return alpha;
	}

	/****************************************************/
	/* 						Setters						*/
	/****************************************************/
	public void setAlpha(int alpha){
		if(alpha > 255 || alpha < 0){
			throw new ColorException();
		}else{
			this.alpha = alpha;
		}
	}

	/****************************************************/
	/*						Ctors			 			*/
	/****************************************************/
	public ColorWithAlpha(int alpha){
		setAlpha(alpha);
		setR(0);
		setG(0);
		setB(0);
	}

	//this ctor will give the values of red, green, and blue
	//to the ctor of the SimpleColor class that takes 3 args. 
	//the ctor of the SimpleColor class will then do the assignment
	//of the variable data in its own class using its own setter methods.
	//Then, the alpha color is set within this class. 
	public ColorWithAlpha(int r, int g, int b, int alpha){
		super(r,g,b);
		setAlpha(alpha);
	}

	//the copy ctor
	public ColorWithAlpha(ColorWithAlpha aCopyOf){
		super(aCopyOf);
		this.alpha = aCopyOf.alpha;
	}

	/****************************************************/
	/*				Custom override methods				*/
	/* first overridden method is the toString method	*/
	/* for displaying the RGBA values to the console.	*/
	/* the second overridden method is the equals method*/
	/* this will compare the values of the current RGBA	*/
	/* to those passed in to the class.					*/
	/****************************************************/

	public String toString(){
		return super.toString() + ", alpha: " + alpha;
	}

	//this method overrides the default equals method. 
	//The overridden equals method from the super class (SimpleColor)
	//is used to compare the objects using RBG and then the
	//value of the alpha from this class is checked against
	//the new object's alpha. If both the object in RBG values,
	//and the alpha value from this class are the same, they must be equal.
	public boolean equals(ColorWithAlpha other){
		if(super.equals(other) == true && this.alpha == other.alpha){
			return true;
		}else{
			return false;
		}
	}
}