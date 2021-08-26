package customClasses;

public class Incubator {

    private int temperature;

    public static int MAX = 10;
    public static int MIN = -10;

    public Incubator() {
	temperature = 5;
    }

    public int getTemperature() {
	return temperature;
    }

    // small modification by me (int by),
    // unfortunatelly there are no default values in java)
    public boolean increaseTemperature(int by) {
	int newTemperature = temperature + by;
	if (newTemperature <= MAX) {
	    temperature = newTemperature;
	    return true;
	} else {
	    return false;
	}
    }

    // small modification by me (int by),
    // unfortunatelly there are no default values in java)
    public boolean decreaseTemperature(int by) {
	int newTemperature = temperature - by;
	if (newTemperature >= MIN) {
	    temperature = newTemperature;
	    return true;
	} else {
	    return false;
	}
    }
}
