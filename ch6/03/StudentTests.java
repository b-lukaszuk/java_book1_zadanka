import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class StudentTests {

	private static int[] enterExamMarks() {
		Scanner kbd = new Scanner(System.in);
		int[] marks;
		System.out.println("How many marks would you like to enter");
		marks = new int[kbd.nextInt()];

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter " + (i + 1) + " mark:");
			marks[i] = kbd.nextInt();
		}
		System.out.println("All the marks have been entered");
		return marks;
	}

	// functional approach, the original list is unmodified
	// in JS it is recommended, here I don't know
	private static int[] increaseMarksBy(int incrBy, int[] marks) {
		int[] marks1 = new int[marks.length];
		for (int i = 0; i < marks.length; i++) {
			marks1[i] = marks[i] + incrBy;
		}
		return marks1;
	}

	// cuttof >= mark
	private static boolean allHavePassed(int cutoff, int[] marks) {
		boolean result = true;
		for (int mark : marks) {
			if (mark < cutoff) {
				result = false;
				break;
			}
		}
		return result;
	}

	private static void printMarks(int[] marks) {
		for (int i = 0; i < marks.length; i++) {
			System.out.printf("mark[%d] = %d%n", i + 1, marks[i]);
		}
	}

	public static void main(String[] args) {
		int[] javaStudents; // store students marks here
		int incrMarkBy = 5;
		int passThreshold = 40;
		javaStudents = enterExamMarks();

		System.out.printf("Adding %d bonus point(s) to the marks%n",
				  incrMarkBy);
		javaStudents = increaseMarksBy(5, javaStudents);

		System.out.println("Current marks:");
		printMarks(javaStudents);

		System.out.printf("Checking did all the students passed: %s%n",
				  (allHavePassed(passThreshold, javaStudents)));
	}
}
