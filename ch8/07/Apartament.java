package Apartament;
import java.util.ArrayList;
import Oblong.Oblong;

public class Apartament {

	private ArrayList<Oblong> rooms;

	public static void main(String[] args) {

	}

	private boolean isIndexOk(int indexIn) {
		return indexIn >= 0 && indexIn < rooms.size();
	}

	public void add(Oblong roomIn) {
		rooms.add(roomIn);
	}

	public double getRoomArea(int indexIn) {
		if (isIndexOk(indexIn)) {
			return rooms.get(indexIn).calculateArea();
		} else {
			return -999;
		}
	}

	public double getRoomLength(int indexIn) {
		if (isIndexOk(indexIn)) {
			return rooms.get(indexIn).getLength();
		} else {
			return -999;
		}
	}

	public double getRoomHeight(int indexIn) {
		if (isIndexOk(indexIn)) {
			return rooms.get(indexIn).getHeight();
		} else {
			return -999;
		}
	}
}
