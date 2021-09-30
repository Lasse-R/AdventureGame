import java.util.Scanner;

public class Adventure {

        Scanner scan = new Scanner(System.in);
        String playerInput;
        boolean gameIsRunning = true;
        boolean validAnswer = false;

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();
        Room room4 = new Room();
        Room room5 = new Room();
        Room room6 = new Room();
        Room room7 = new Room();
        Room room8 = new Room();
        Room room9 = new Room();

        /*
        room1.north = null; room1.west = null; room1.south = room4; room1.east = room2;
        room2.north = null; room2.west = room1; room2.south = null; room2.east = room3;
        room3.north = null; room3.west = room2; room3.south = room6; room3.east = null;
        room4.north = room1; room4.west = null; room4.south = room7; room4.east = null;
        room5.north = null; room5.west = null; room5.south = room8; room5.east = null;
        room6.north = room3; room6.west = null; room6.south = room9; room6.east = null;
        room7.north = room4; room7.west = null; room7.south = null; room7.east = room8;
        room8.north = room5; room8.west = room7; room8.south = null; room8.east = room9;
        room9.north = room6; room9.west = room8; room9.south = null; room9.east = null;

         */

        public void start(){
        System.out.println("Welcome to the game!");
        System.out.println("You now have 5 options:");
        System.out.println("1: go north. 2: go east. 3: go south. 4: go west or 5: exit.");
        while (gameIsRunning) {
            do {
                System.out.print("Write Command: ");
                playerInput = scan.nextLine();
                if (playerInput.equalsIgnoreCase("go north") ||
                        playerInput.equalsIgnoreCase("go South") ||
                        playerInput.equalsIgnoreCase("go west") ||
                        playerInput.equalsIgnoreCase("go east") ||
                        playerInput.equalsIgnoreCase("quit") ||
                        playerInput.equalsIgnoreCase("look")) {
                    validAnswer = true;
                } else {
                    System.out.println("Invalid Input - try again!");
                }
            } while (!validAnswer);

            if (playerInput.equalsIgnoreCase("go north")) {
                System.out.println("Going North!");

            }
            if (playerInput.equalsIgnoreCase("go south")) {
                System.out.println("Going South!");

            }
            if (playerInput.equalsIgnoreCase("go east")) {
                System.out.println("Going East!");

            }
            if (playerInput.equalsIgnoreCase("go west")) {
                System.out.println("Going West!");

            }
            if (playerInput.equalsIgnoreCase("look")) {
                System.out.println("You're looking around the room.");
                System.out.println(room1);

            }
            if (playerInput.equalsIgnoreCase("quit")) {
                System.out.println("Quitting Game!");
                gameIsRunning = false;
            }

            }
        }


    }

