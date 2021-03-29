import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class RaggedArray {

    // ragged array looks more or less like
    // right triangle a^2 + b^2 = c^2, so sideB
    private static double[][] getRaggedArray(int sideBlength) {
	double[][] triangle = new double[sideBlength][];
	for (int i = 0; i < sideBlength; i++) {
	    int subArraySize = sideBlength - (sideBlength - (i + 1));
	    triangle[i] = new double[subArraySize];
	}
	return triangle;
     }

    private static int askUsrForArraySize() {
	Scanner kbd = new Scanner(System.in);
	int sideBsize;
	System.out.println("Enter size of the triangle (sideB):");
	sideBsize = kbd.nextInt();
	return sideBsize;
     }

    // creates argged array (2d array) of given size
    // fills it with values entered by user
    // returns filled array
    private static double[][] askUsrToFillRaggedArray(int sideBsize) {
	double[][] triangle = getRaggedArray(sideBsize);
	Scanner kbd = new Scanner(System.in);
	for (int row = 0; row < triangle.length; row++) {
	    for (int col = 0; col < triangle[row].length; col++) {
		System.out.printf("Enter value into elt: [%d, %d]:%n",
				  row, col);
		triangle[row][col] = kbd.nextDouble();
	    }
	}
	return triangle;
     }

    private static void printRaggedArray(double[][] triangle) {
	for (int row = 0; row < triangle.length; row++) {
	    String rowToPrint = "";
	    for (int col = 0; col < triangle[row].length; col++) {
		rowToPrint += String.valueOf(triangle[row][col]) + " ";
	    }
	    System.out.println(rowToPrint);
	}
     }

    private static double getMaxOfRaggedArray(double[][] triangle) {
	double maxVal = triangle[0][0];
	// row 1, since row 0 got only 1 value triangle[0][0] (now maxVal)
	for (int row = 1; row < triangle.length; row++) {
	    for (int col = 0; col < triangle[row].length; col++) {
		if(triangle[row][col] > maxVal) {
		    maxVal = triangle[row][col];
		}
	    }
	}
	return maxVal;
     }

    public static void main(String[] args) {

	// ragged array looks more or less like
	// right triangle a^2 + b^2 = c^2, so sideB
	int sideBsize;
	double[][] triangle;

	System.out.println("Hello. Welcome in a program creating ragged " +
			   "array (shaped like right triangle)");

	sideBsize = askUsrForArraySize();

	if(sideBsize < 2) {
	    System.out.println("Length of sideB smaller than 2. " +
			       "Nothing to do here");

	} else {
	    triangle = askUsrToFillRaggedArray(sideBsize);

	    System.out.println("\nYour array looks like:");
	    printRaggedArray(triangle);

	    System.out.println("\nIts maximal value is:");
	    System.out.println(getMaxOfRaggedArray(triangle));
	}

	System.out.println("\nGoodbye!");
    }
}
