import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class StringComparison {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String string1, string2;
        boolean comparison;

        // get two strings from the user
        System.out.print("Enter a String: ");
        string1 = keyboard.next();
        System.out.print("Enter another String: ");
        string2 = keyboard.next();

	System.out.println("Performing case sensitive " +
			   "equality test for two strings...");

        // compare the strings
        comparison = string1.equals(string2);
	if (comparison) {
	    System.out.println("The strings are identical");
	} else {
	    System.out.println("Those are different strings");
	}
    }
}
