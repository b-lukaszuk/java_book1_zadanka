import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class PoundsToKgsConverter {

    private static double poundsToKgs(double pounds) {
	return pounds * 0.45359237;
    }

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	double weight;

	System.out.println("Enter weight in pounds (number only):");
	weight = keyboard.nextFloat();
	System.out.printf("%.2f pound(s) = %.2f kilogram(s)%n", weight,
			  poundsToKgs(weight));

	System.out.println("That's it goodbye!");
    }
}
