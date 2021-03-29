import java.util.Scanner;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class TemperatureReadings3 {

    public static void main(String[] args) {
	double[] temperature ;
	temperature = enterTemps(); // call new version of this method
	displayTemps(temperature);
    }

    // method to enter temperatures returns an array
    static double[] enterTemps() {
	Scanner keyboard = new Scanner(System.in);
	double[] temperatureOut = new double[7];
	for (int i = 0; i < temperatureOut.length; i++) {
	    System.out.println("enter max temperature for day " + (i+1));
	    temperatureOut[i] = keyboard.nextDouble();
	}
	return temperatureOut;
    }

    private static boolean wasHot(double temp) {
	return temp >= 18;
    }

    // this method is unchanged
    static void displayTemps(double[] temperatureIn) {
	System.out.println();
	System.out.println("***TEMPERATURES ENTERED***");
	System.out.println();
	for (int i = 0; i < temperatureIn.length; i++) {
	    System.out.printf("day "+(i+1)+" "+ temperatureIn[i]);
	    System.out.printf("It %s day%n%n",
			      wasHot(temperatureIn[i]) ?
			      "was a hot" : "was a cold");
	}
    }
}
