public class SimpleColor {

	//class variables that represent r=red, g=green, and b=blue
	private int r;
	private int g;
	private int b;

	/****************************************************/
	/*						Getters						*/
	/****************************************************/
	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	/****************************************************/
	/* 						Setters						*/
	/* each setter method here has an if-else statement */
	/* that will check that the number provided for the */
	/* value is within range of accepted values for color*/
	/****************************************************/
	public void setR(int r) {
		if(r > 255 || r < 0){
			throw new ColorException();
		}else{
			this.r = r;
		}
	}

	public void setG(int g) {
		if(g > 255 || g < 0){
			throw new ColorException();
		}else{
			this.g = g;
		}
	}

	public void setB(int b) {
		if(b > 255 || b < 0){
			throw new ColorException();
		}else{
			this.b = b;
		}
	}

	public void setColor(int a, int b, int c) {
		setR(a);
		setG(b);
		setB(c);
	}

	/****************************************************/
	/*						Ctors		 				*/
	/* The first ctor is a no arg, the second will take	*/
	/* in the RGB value sand set the values from the arg*/
	/* list to the class variables, and the third is a	*/
	/* copy ctor.										*/
	/****************************************************/
	public SimpleColor() {}

	public SimpleColor(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}

	public SimpleColor(SimpleColor b) {
		this(b.r,b.g,b.b);
	}
	
	/****************************************************/
	/*				Custom override methods				*/
	/* first overridden method is the toString method	*/
	/* for displaying the RGBA values to the console.	*/
	/* the second overridden method is the equals method*/
	/* this will compare the values of the current RGB	*/
	/* to those passed in to the class.					*/
	/****************************************************/
	
	public String toString(){
		return "red: " + r + ", green: " + g + ", blue: " + b;
	}
	
	
	public boolean equals(SimpleColor other){
		if(this.r == other.r && this.g == other.g && this.b == other.b){
			return true;
		}else{
			return false;
		}
	}
}