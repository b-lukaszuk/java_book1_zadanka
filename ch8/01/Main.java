import customClasses.CircularShape;
import java.util.Scanner;

public class Main {

    public static void circleTester(CircularShape circleIn) {
	System.out.printf("We got a circle. Its radius = %.2f [cm]%n",
			  circleIn.calculateDiameter() / 2);
	System.out.printf("Its diameter = %.2f [cm]%n",
			  circleIn.calculateDiameter());
	System.out.printf("Its area = %.2f [cm^2]%n",
			  circleIn.calculateArea());
	System.out.printf("Its perimeter = %.2f [cm]%n",
			  circleIn.calculateCircumference());
    }

    public static void main(String[] args) {

	double circleRadius = 4;
	CircularShape circle1 = new CircularShape(4);
	Scanner kbd = new Scanner(System.in);

	circleTester(circle1);

	System.out.println("\nResetting radius of the circle. " +
			   "Enter new radius");
	circle1.setRadius(kbd.nextDouble());
	System.out.println("Radius succesfully reseted. Info:\n");

	circleTester(circle1);
    }

}
