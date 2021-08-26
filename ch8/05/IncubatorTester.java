import customClasses.Incubator;

public class IncubatorTester {

    public static void main(String[] args) {
	Incubator incubator1;

	System.out.printf("Creating incubator1%n%n");
	incubator1 = new Incubator();

	System.out.printf("Incubator1 initial temperature: %d [deg. C] %n%n",
			  incubator1.getTemperature());

	// increasing temperature
	System.out.printf("Incubator1 increasing the temperature by %d units%n",
			  5);
	System.out.printf("Incubator1 alert raised? %b%n",
			  !incubator1.increaseTemperature(5));
	System.out.printf("Incubator1 temperature: %d [deg. C] %n",
			  incubator1.getTemperature());
	System.out.printf("Incubator1 increasing the temperature by %d units%n",
			  1);
	System.out.printf("Incubator1 alert raised? %b%n",
			  !incubator1.increaseTemperature(5));
	System.out.printf("Incubator1 temperature: %d [deg. C] %n%n",
			  incubator1.getTemperature());

	// decreasing temperature
	System.out.printf("Incubator1 decreasing the temperature by %d units%n",
			  18);
	System.out.printf("Incubator1 alert raised? %b%n",
			  !incubator1.decreaseTemperature(18));
	System.out.printf("Incubator1 temperature: %d [deg. C] %n",
			  incubator1.getTemperature());
	System.out.printf("Incubator1 decreasing the temperature by %d units%n",
			  4);
	System.out.printf("Incubator1 alert raised? %b%n",
			  !incubator1.decreaseTemperature(4));
	System.out.printf("Incubator1 temperature: %d [deg. C] %n",
			  incubator1.getTemperature());

	System.out.println("\nThat's all. Goodbye!");
    }
}
