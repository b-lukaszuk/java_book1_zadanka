import customClasses.EasyScanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class Agent {
    private static String codeName = "";
    // my program will deal without String (class field) confirm
    // private static String confirm = "";

    // check requirements from code name, informs about invalid codename
    private static boolean isCodeNameOK(String name) {
    	int cnLen = name.length();
    	char cnLastChar = name.charAt(cnLen-1);
    	if (!name.startsWith("Agent") || cnLen <= 6 || cnLastChar != 'X') {
	    System.out.println("INVALID CODENAME");
    	    return false;
    	}
    	return true;
    }

    private static String askUsrForCodeName() {
	EasyScanner sn = new EasyScanner();
	String theName = "";
	// should be while loop, but do-while seems to be more fitting here
	do {
	    System.out.println("Enter an Agent's code name:");
	    theName = sn.nextString();
	} while (!isCodeNameOK(theName));
	return theName;
    }

    // the instructions do not specify what to do after failure
    // keep asking (like in method above), declare failure and exit program?
    private static void askUsrToConfirmCodeName(String benchmarkName) {
	EasyScanner sn = new EasyScanner();
	String theConfirmation = "";
	// should be while loop, but do-while seems to be more fitting here
	System.out.println("Retype Agent's Code Name for confirmation");
	theConfirmation = sn.nextString();
	if(theConfirmation.equals(benchmarkName)) {
	    System.out.println("CODE NAME CONFIRMED");
	    System.out.println("Agent code name set correctly");
	} else {
	    System.out.println("CODE NAME MIS-MATCH");
	    System.out.println("No Agent code name set");
	}
    }

    public static void main(String[] args) {

	codeName = askUsrForCodeName();

	askUsrToConfirmCodeName(codeName);

	System.out.println("That's all. Goodbye!");
    }
}
