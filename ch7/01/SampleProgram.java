import classes.Oblong;
import classes.EasyScanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class SampleProgram {

    private static double askUsrFor(String what, int id) {
	EasyScanner es = new EasyScanner();
	System.out.printf("Please enter the %s of Oblong %d:%n", what, id);
	return es.nextDouble();
    }

    public static void main(String[] args) {
	Oblong oblong1 = new Oblong(askUsrFor("length", 1),
				    askUsrFor("width", 1));
	Oblong oblong2 = new Oblong(askUsrFor("length", 2),
				    askUsrFor("width", 2));

	System.out.println(""); // for newline
	System.out.println("The area of oblong1 is " + oblong1.calculateArea());
	System.out.println("The area of oblong2 is " + oblong2.calculateArea());

	System.out.println(""); // for newline
	System.out.println("That's all. Goodbye!");
    }
}
