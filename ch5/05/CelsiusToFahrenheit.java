import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class CelsiusToFahrenheit {

    private static double CelsToFahr(double degCels) {
	return (9*degCels/5) + 32;
    }

    private static double FahrToCels(double degFahr) {
	return (5*(degFahr-32))/9;
    }

    private static void displayMenu() {
	System.out.println("\n=============");
	System.out.println("What would you like to do?");
	System.out.println("[1] convert from temp. from Celsius to Fahrenheit");
	System.out.println("[2] convert from temp. from Fahrenheit to Celsius");
	System.out.println("[3] exit program");
	System.out.println("=============");
    }

    private static double askForTemp(boolean askForCelsius) {
	Scanner kbd = new Scanner(System.in);
	double temperature;
	System.out.printf("Enter temperature (%s)%n",
			  askForCelsius ? "in Celsius" : "in Fahrenheit");
	temperature = kbd.nextDouble();
	return temperature;
    }

    private static void displayConvInfo(double tempDeg,
					boolean inCelsius) {
	Scanner kbd = new Scanner(System.in);
	double result;
	if ((inCelsius && tempDeg < -273.15) ||
	    (!inCelsius && tempDeg < -459.67)) {
	    System.out.println("Temp can't be lower than abs. 0 (0 deg. K)");
	} else {
	    result = inCelsius ? CelsToFahr(tempDeg) : FahrToCels(tempDeg);
	    System.out.printf("%.2f deg. %s = %.2f deg. %s%n",
			      tempDeg, inCelsius ? "C" : "F",
			      result, inCelsius ? "F" : "C");
	}
    }

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double temp;
	char userChoice;

	System.out.println("Hello. Welcome in temperature converting program");

	do {
	    displayMenu();

	    userChoice = keyboard.next().charAt(0);

	    switch (userChoice) {
	    case '1': {
		temp = askForTemp(true);
		displayConvInfo(temp, true);
	    }; break;
	    case '2': {
		temp = askForTemp(false);
		displayConvInfo(temp, false);
	    }; break;
	    case '3': {
		System.out.println("The program will now exit!");
	    } break;
	    default:
		System.out.println("Incorrect option chosen. Try again");
	    }
	} while (userChoice != '3');

	System.out.println("Goodbye!");
    }
}
