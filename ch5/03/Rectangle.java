import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class Rectangle {

    private static double getArea(double length, double width) {
	return length * width;
    }

    private static double getPerimeter(double length, double width) {
	return 2*(length + width);
    }

    // lOrW - 'l' | 'w' ('w' is the default)
    // l - length, w - width
    private static double askForRectDim(char lOrW) {
	Scanner kbd = new Scanner(System.in);
	System.out.printf("Enter %s of the rectangle (in cm)%n",
			  lOrW == 'l' ? "length" : "width");
	double userInput = kbd.nextDouble();
	return userInput;
    }

    // aOrP - 'a' | 'p' ('p' is the default)
    // a - area, p - perimeter
    private static void displayAreaOrPerim(char aOrP,
					   double length, double width) {
	Scanner kbd = new Scanner(System.in);
	String msg;
	msg = String.format("The %s of the rectangle (0 if unspecified):",
			    aOrP == 'a' ? "area" : "perimeter");
	double result = (aOrP == 'a' ?
			 getArea(length, width) : getPerimeter(length, width));
	System.out.printf("%s %.2f %s%n", msg, result,
			  aOrP == 'a' ? "cm^2" : "cm");
    }

    private static void displayMenuOptions() {
	System.out.println("=============");
	System.out.println("Hello. What would you like to do?");
	System.out.println("[1] specify size of a rectangle [cm x cm]");
	System.out.println("[2] calculate the area of the rectangle");
	System.out.println("[3] calculate the perimeter of the rectangle");
	System.out.println("[4] exit program");
	System.out.println("=============");
    }

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double sideA = 0;
	double sideB = 0;
	char userChoice;

	do {
	    displayMenuOptions();

	    userChoice = keyboard.next().charAt(0);

	    switch (userChoice) {
	    case '1': {
		sideA = askForRectDim('l');
		sideB = askForRectDim('w');
	    }; break;
	    case '2': {
		displayAreaOrPerim('a', sideA, sideB);
	    }; break;
	    case '3': {
		displayAreaOrPerim('p', sideA, sideB);
	    } break;
	    case '4': {
		System.out.println("The program will now exit!");
	    }; break;
	    default:
		System.out.println("Incorrect option chosen. Try again");
	    }
	} while (userChoice != '4');

	System.out.println("Goodbye!");
    }
}
