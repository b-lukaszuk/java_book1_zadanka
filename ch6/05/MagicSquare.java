// the program does not check for the input corectness
// (unless reqired in the task specification)
public class MagicSquare {

    // required magicSquare object
    private static char[][] magicSquare = {
	{'p', 'r', 'e', 'y'},
	{'l', 'a', 'v', 'a'},
	{'o', 'v', 'e', 'r'},
	{'t', 'e', 'n', 'd'},
    };

    // required displayRow method
    private static String displayRow(int rowId, char[][] magSq) {
   	String wordInRow = "";
   	for (int col = 0; col < magSq[rowId].length; col++) {
   	    wordInRow += magSq[rowId][col];
   	}
   	return wordInRow;
    }

    // required displayColumn method
    private static String displayColumn(int colId, char[][] magSq) {
   	String wordInCol = "";
   	for (int row = 0; row < magSq.length; row++) {
   	    wordInCol += magSq[row][colId];
   	}
   	return wordInCol;
    }

    private static void displayMagSq(char[][] magSq) {
   	for (int row = 0; row < magSq.length; row++) {
   	    String rowToPrint = "";
   	    for (int col = 0; col < magSq[row].length; col++) {
   		rowToPrint += (magSq[row][col]) + " ";
	    }
   	    System.out.println(rowToPrint);
   	}
    }

    public static void main(String[] args) {
   	System.out.println("Behold the magic square:");
   	displayMagSq(magicSquare);

   	System.out.println("The word hidden in its third row is: " +
   			   displayRow(2, magicSquare));
   	System.out.println("The word hidden in its second column is: " +
   			   displayColumn(1, magicSquare));

   	System.out.println("That's it. Goodbye!");
    }
}
