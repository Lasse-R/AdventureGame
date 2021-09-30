public class Room {

    private Room north;
    private Room south;
    private Room west;
    private Room east;

    private int roomNumber;
    private String name;
    private String description;
    private String teleport;

    Room(){

    }

    Room(int roomNumber, String description){
        this.roomNumber = roomNumber;
        this.description = description;
    }

    Room(int roomNumber, String description, String teleport){
        this.roomNumber = roomNumber;
        this.description = description;
        this.teleport = teleport;
    }

    public void setTeleport(String teleport){
        this.teleport = teleport;
        }

    public String getTeleport() {
        return teleport;
    }

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
    }
