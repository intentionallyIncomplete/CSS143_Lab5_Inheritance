package ShapeInheritanceDemo;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class Circle extends Shape {
	//class variables that is local to 
	//this class for use in calculating 
	//the area of a circle. Radius here must
	//be an integer to be able 
	//to be used in the draw() method later
	private int r;
	private final int DENSITY = 10;

	//this ctor will need three values instead
	//of the usual two because there is a third
	//parameter needed to define a circle
	public Circle(int x, int y, int r){
		super(x, y);
		this.r = r;
	}

	public double getArea(){
		return Math.PI * r * r;
	}

	public int getR(){
		return r;
	}

	public void setR(int r){
		if(r > 0){
			this.r = r;
		}else{
			System.out.println("error setting radius");
		}
	}
	public void draw(Graphics g){
		Graphics2D g2d = (Graphics2D) g;

		final int x = getX();
		final int y = getY();

		g2d.drawOval(x, y, r, r);
	}
}