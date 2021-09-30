public class Room {

    private Room north;
    private Room south;
    private Room west;
    private Room east;

    private int roomNumber;
    private String name;
    private String description;

    Room(){    }

    Room(int roomNumber){    }

    public void setNorth(Room north){
        this.north = north;
    }

    public void setSouth(Room south){
        this.south = south;
    }

    public void setWest(Room west){
        this.west = west;
    }

    public void setEast(Room east){
        this.east = east;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Room getNorth(){
        return north;
    }

    public Room getSouth(){
        return south;
    }

    public Room getWest(){
        return west;
    }

    public Room getEast(){
        return east;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
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
