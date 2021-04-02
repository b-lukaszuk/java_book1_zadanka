// built-ins import
import java.util.Scanner;
import java.util.ArrayList;

// custom defined classes import
import classes.Oblong;

// the program does not check for the input corectness
// (unless reqired in the task specification)
public class Rooms {

    private static Oblong aksUsrForSingleRoomDims() {
       Scanner kbd = new Scanner(System.in);
       double length, width;

       System.out.println("Enter width of the room");
       width = kbd.nextDouble();
       System.out.println("Enter length of the room");
       length = kbd.nextDouble();

       // oblong accepts lengthIn and heightIn
       return new Oblong(width, length);
     }

    private static ArrayList<Oblong> askUsrForRoomsDims(int nOfRooms) {
	ArrayList<Oblong> rooms = new ArrayList<Oblong>();

	for (int i = 0; i < nOfRooms; i++) {
	    System.out.printf("--Room %d:%n", i+1);
	    rooms.add(aksUsrForSingleRoomDims());
	}

	System.out.println("Dimentions of all the rooms have been entered");

	return rooms;
     }

    private static void displayRoomInfo(Oblong roomIn, boolean shortVersion) {
	if(shortVersion) {
	    System.out.printf("Dims: %.2f [m] x %.2f[m]%n",
			      roomIn.getLength(), roomIn.getHeight());
	} else {
	    // i added perimeter (not required in the task specification)
	    System.out.printf("Dims: %.2f [m] x %.2f[m], " +
			      "area: %.2f [m^2], " +
			      "perim: %.2f [m]%n",
			      roomIn.getLength(), roomIn.getHeight(),
			      roomIn.calculateArea(),
			      roomIn.calculatePerimeter());
	}
    }

    private static void displayRoomsInfo(ArrayList<Oblong> roomsIn,
					 boolean shortVersion) {
	for (int i = 0; i < roomsIn.size(); i++) {
	    System.out.println("--Room " + (i+1) + ":");
	    displayRoomInfo(roomsIn.get(i), shortVersion);
	}
     }

   public static void main(String[] args) {
       // variables
       ArrayList<Oblong> rooms;
       int numOfRooms = 0;
       int roomId = 0;
       Scanner kbd = new Scanner(System.in);

       // program execution
       System.out.println("Wellcome to the room creator.\n");

       System.out.println("How many rooms do you want to create?");
       numOfRooms = kbd.nextInt();
       rooms = askUsrForRoomsDims(numOfRooms);

       System.out.printf("%nThe following rooms are available%n");
       displayRoomsInfo(rooms, true);

       System.out.println("\nEnter a room number to get full info about it:");
       roomId = kbd.nextInt();
       System.out.println("Room " + (roomId) + ":");
       displayRoomInfo(rooms.get(roomId - 1), false);

       System.out.println("\nThat's all. Goodbye!");
   }
}
