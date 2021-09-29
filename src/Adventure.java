import java.util.Scanner;

public class Adventure {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerInput;
        boolean gameIsRunning = true;
        boolean validAnswer = false;
        Room currentRoom = new Room("Room one", 1, "The room is dark and cold, you see " +
                "doors in some of the walls but it's hard to distinguish what's left and right in the dark");

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
                        playerInput.equalsIgnoreCase("exit") ||
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
            if (playerInput.equalsIgnoreCase("look")){
                System.out.println("You're looking around the room.");
                System.out.println(currentRoom);
            }
            if (playerInput.equalsIgnoreCase("exit")) {
                System.out.println("Quitting Game!");
                gameIsRunning = false;
            }
        }


    }
}
