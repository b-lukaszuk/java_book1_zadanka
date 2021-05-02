import java.util.Scanner;

import customClasses.Sensor;

public class SensorTester {

    // asks user for pressure to be set in a sensor
    public static double askUsrForPressure() {
	Scanner kbd = new Scanner(System.in);
	double newPressure;
	System.out.println("Enter pressure value of the sensor:");
	newPressure = kbd.nextDouble();
	return newPressure;
    }

    public static void main(String[] args) {
	Sensor sensor1, sensor2;

	System.out.println("Creating sensor1 initialized with default values");
	sensor1 = new Sensor();

	System.out.println("\nCreating sensor2.");
	sensor2 = new Sensor(askUsrForPressure());
	System.out.println("Inintializing sensor2 with max(0, user input)");
	System.out.printf("Pressure set on sensor2 is %.2f%n",
			  sensor2.getPressure());

	System.out.println("\nChanging pressure on sensor1");
	System.out.printf("Current pressure on sensor1 is %.2f%n",
			  sensor1.getPressure());
	sensor1.setPressure(askUsrForPressure());
	System.out.println("Setting sensor1 pressure to max(0, user input)");
	System.out.printf("Pressure set on sensor1 is %.2f%n",
			  sensor1.getPressure());

	System.out.println("\nThat's all. Goodbye!");
    }
}
