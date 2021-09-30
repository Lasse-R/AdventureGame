public class Room {

    Room north;
    Room south;
    Room west;
    Room east;

    int roomNumber;
    String name;
    String description;

    Room(){

    }

    Room(String name, int roomNumber, String description) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.description = description;

    }


    public String toString() {
        return "You find yourself in a room with the number " + this.roomNumber + " printed on the wall.\n" +
                "But if this is " + this.name + " then that must mean more rooms lie ahead.\n" +
                this.description;

    }


}
