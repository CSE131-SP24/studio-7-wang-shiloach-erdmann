package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	
	private double width;
	private double length;


public rectangle(double initLength, double initWidth) {
	this.width = initWidth;
	this.length = initLength;
			}

public void areaPerim() {
	System.out.println("Area = " + width*length);
	System.out.println("Perimeter = " + (2*width + 2*length));
}

public void draw() {
	StdDraw.rectangle(.5, .5, width/2, length/2);
}

public void square() {
	if (width == length) {
		System.out.println("It is a square");
	}
	else {
		System.out.println("It is not a square");
	}
}

public static void main(String[] args) {
	rectangle myRectangle = new rectangle(.6, .6);
	myRectangle.areaPerim();
	myRectangle.square();
	myRectangle.draw();
}
}