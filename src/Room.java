public class Room {

    String name;
    String description;
    int roomNumber;

    Room(String name, int roomNumber, String description) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.description = description;

    }

    public String toString(){
        return "you find yourself in a room with the number " + this.roomNumber + " printed on the wall.\n" +
                "but if this is " + this.name + " then that must mean more rooms lie ahead.\n" +
                this.description;
    }

}
