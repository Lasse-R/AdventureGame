import java.util.Scanner;

public class Adventure {

    Scanner scan = new Scanner(System.in);
    String playerInput;
    boolean gameIsRunning = true;
    boolean validAnswer = false;

    FluffyDescription description1 = new FluffyDescription();
    FluffyDescription description2 = new FluffyDescription();
    FluffyDescription description3 = new FluffyDescription();
    FluffyDescription description4 = new FluffyDescription();
    FluffyDescription description5 = new FluffyDescription();
    FluffyDescription description6 = new FluffyDescription();
    FluffyDescription description7 = new FluffyDescription();
    FluffyDescription description8 = new FluffyDescription();
    FluffyDescription description9 = new FluffyDescription();

    Room room1 = new Room(1, "You find yourself at a cave entrance.");
    Room room2 = new Room(2, description2.toString());
    Room room3 = new Room(3, description3.toString());
    Room room4 = new Room(4, description4.toString());
    Room room5 = new Room(5, description5.toString(), "You find the magic word xyzzy");
    Room room6 = new Room(6, description6.toString());
    Room room7 = new Room(7, description7.toString());
    Room room8 = new Room(8, description8.toString());
    Room room9 = new Room(9, description9.toString());

    Room currentRoom = new Room();

    public void start() {

        currentRoom = room1;
        room1.setEast(room2); room1.setSouth(room4);
        room2.setWest(room1); room2.setEast(room3);
        room3.setWest(room2); room3.setSouth(room6);
        room4.setNorth(room1); room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3); room6.setSouth(room9);
        room7.setNorth(room4); room7.setEast(room8);
        room8.setNorth(room5); room8.setWest(room7); room8.setEast(room9);
        room9.setNorth(room6); room9.setWest(room8);

        System.out.println("Welcome to the game!");
        System.out.println("You have these options:");
        System.out.println("1: go north or n. 2: go east or e. 3: go south or s. 4: go west or w or 5: look.\n" +
                "6: help. 7: quit");
        System.out.println(currentRoom.getDescription());
        while (gameIsRunning) {
            do {
                System.out.print("Write Command: ");
                playerInput = scan.nextLine();
                if (playerInput.equalsIgnoreCase("go north") ||
                        playerInput.equalsIgnoreCase("go south") ||
                        playerInput.equalsIgnoreCase("go west") ||
                        playerInput.equalsIgnoreCase("go east") ||
                        playerInput.equalsIgnoreCase("quit") ||
                        playerInput.equalsIgnoreCase("look") ||
                        playerInput.equalsIgnoreCase("help") ||
                        playerInput.equalsIgnoreCase("n") ||
                        playerInput.equalsIgnoreCase("s") ||
                        playerInput.equalsIgnoreCase("e") ||
                        playerInput.equalsIgnoreCase("w") ||
                        playerInput.equalsIgnoreCase("xyzzy")) {
                    validAnswer = true;
                } else {
                    System.out.println("Invalid Input - try again!");
                }
            } while (!validAnswer);

            if (playerInput.equalsIgnoreCase("go north") || playerInput.equalsIgnoreCase("n")) {
                if (currentRoom.getNorth() == null) {
                    System.out.println("You cant go that way.\n What would you like to do instead?");
                } else {
                    currentRoom = currentRoom.getNorth();
                    System.out.println("Going North!");
                    System.out.println(currentRoom.getDescription());
                    if(currentRoom == room5){
                        System.out.println(room5.getTeleport());
                    }
                }

            }
            if (playerInput.equalsIgnoreCase("go south") || playerInput.equalsIgnoreCase("s")) {
                  if (currentRoom.getSouth() == null) {
                    System.out.println("You cant go that way.\n What would you like to do instead?");
                } else {
                    currentRoom = currentRoom.getSouth();
                      System.out.println("Going South!");
                    System.out.println(currentRoom.getDescription());
                }

            }
            if (playerInput.equalsIgnoreCase("go east") || playerInput.equalsIgnoreCase("e")) {
                  if (currentRoom.getEast() == null) {
                    System.out.println("You cant go that way.\n What would you like to do instead?");
                } else {
                    currentRoom = currentRoom.getEast();
                      System.out.println("Going East!");
                    System.out.println(currentRoom.getDescription());
                }

            }
            if (playerInput.equalsIgnoreCase("go west") || playerInput.equalsIgnoreCase("w")) {
                  if (currentRoom.getWest() == null) {
                    System.out.println("You cant go that way.\n What would you like to do instead?");
                } else {
                    currentRoom = currentRoom.getWest();
                      System.out.println("Going West!");
                    System.out.println(currentRoom.getDescription());
                }

            }
            if (playerInput.equalsIgnoreCase("look")) {
                System.out.println(currentRoom.getDescription());

            }
            if(playerInput.equalsIgnoreCase("xyzzy")){
                currentRoom = room1;
                System.out.println(room1.getDescription());
                System.out.println("You are free of the cave again!");
                System.out.println("You've won the game!");
                gameIsRunning = false;
            }
            if (playerInput.equalsIgnoreCase("quit")) {
                System.out.println("Quitting Game!");
                gameIsRunning = false;
            }
            if(playerInput.equalsIgnoreCase("help")){
                System.out.println("1: go north or n. 2: go east or e. 3: go south or s. 4: go west or w or 5: look.\n" +
                        "6: help. 7: quit");
            }

        }

    }

}

