package ShapeInheritanceDemo;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/*
 * Class Spray
 * 
 * Author: Rob Nash
 */

class Spray extends Shape {
	private final int RADIUS = 20;
	private final int DENSITY = 10;


	public Spray( int a, int b ) {
		//we explicitly call a superclass constructor that takes 2 ints
		//the a and b values will be assigned to x and y in the ctor
		//of the Shape class. 
		super( a, b);
	}

	//overriding the getArea method from the Shape class
	//to get the area of an ellipse. Since a and b
	//are assigned to x and y, call the super class
	//to get the values that were passed in through the subclass.
	public double getArea(){
		return Math.PI * super.getX() * super.getY();
	}

	public void draw( Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		final int x = getX();
		final int y = getY();

		g2d.setColor( Color.GREEN );
		g2d.setPaint( new GradientPaint( x, y, Color.GREEN, x + RADIUS/4, y + RADIUS/4, Color.BLACK, true) );

		int xOffset = 0;
		int yOffset = 0;
		for( int i = 0; i < DENSITY; i++) {
			xOffset = (int) (Math.random()*RADIUS);
			yOffset = (int) (Math.random()*RADIUS);
			g2d.draw( new Ellipse2D.Double( x + xOffset, y + yOffset, x + xOffset+3, y + yOffset+3) );
		}
	}
}