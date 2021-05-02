package customClasses;

public class Sensor {
    private double pressure;

    public Sensor() {
	pressure = 0;
    }

    public Sensor(double pressureIn) {
	pressure = pressureIn >= 0 ? pressureIn : 0;
    }

    public boolean setPressure(double pressureIn) {
	if (pressureIn < 0) {
	    return false;
	} else {
	    pressure = pressureIn;
	    return true;
	}
    }

    public double getPressure() {
	return pressure;
    }
}
