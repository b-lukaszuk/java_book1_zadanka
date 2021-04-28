package customClasses;

import java.lang.Math;

public class CircularShape {
    private double radius;

   public CircularShape(double radiusIn) {
       radius = radiusIn;
   }

    public void setRadius(double radiusIn) {
	radius = radiusIn;
    }

    public double calculateArea() {
	return Math.PI * radius * radius;
     }

    public double calculateCircumference() {
	return 2 * Math.PI * radius;
     }

    public double calculateDiameter() {
	return radius * 2;
     }

}
