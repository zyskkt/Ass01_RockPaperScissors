import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize scanner
        Scanner in = new Scanner(System.in);
        //Set gameplay loop to true
        boolean playAgain = true;
        //booleans to check if input is valid
        boolean validInputA;
        boolean validInputB;
        //Player move strings
        String playerAMove = "";
        String playerBMove = "";
        //Begin gameplay loop
        while (playAgain) {
            //Set inputs to invalid by default before checking them.
            validInputA = false;
            validInputB = false;
            //Begin player A loop
            while (!validInputA) {
                //Ask for input
                System.out.println("Player 1, make your move! (R, P, S)");
                //Get input
                playerAMove = in.nextLine();
                //Check for valid input with if statements, if valid set it to true.
                if (playerAMove.equalsIgnoreCase("R") || playerAMove.equalsIgnoreCase("P") || playerAMove.equalsIgnoreCase("S")) {
                    validInputA = true;
                } else {
                    //If invalid, prompt for input again until they make a valid input.
                    System.out.println("Invalid input, please enter R, P, or S.");
                }
            }
            while (!validInputB) {
                System.out.println("Player 2, make your move! (R, P, S)");
                playerBMove = in.nextLine();
                if (playerBMove.equalsIgnoreCase("R") || playerBMove.equalsIgnoreCase("P") || playerBMove.equalsIgnoreCase("S")) {
                    validInputB = true;
                } else {
                    System.out.println("Invalid input, please enter R, P, or S.");
                }
            }
            //Lots of if statements for every R-P-S possibility.
            if (playerAMove.equalsIgnoreCase("R") && playerBMove.equalsIgnoreCase("S")) {
                System.out.println("Rock Breaks Scissors, Player 1 wins!");
            } else if (playerAMove.equalsIgnoreCase("S") && playerBMove.equalsIgnoreCase("P")) {
                System.out.println("Scissors Cut Paper, Player 1 wins!");
            } else if (playerAMove.equalsIgnoreCase("P") && playerBMove.equalsIgnoreCase("R")) {
                System.out.println("Paper Covers Rock, Player 1 Wins");
            } else if (playerBMove.equalsIgnoreCase("R") && playerAMove.equalsIgnoreCase("S")) {
                System.out.println("Rock Breaks Scissors, Player 2 wins!");
            } else if (playerBMove.equalsIgnoreCase("S") && playerAMove.equalsIgnoreCase("P")) {
                System.out.println("Scissors Cut Paper, Player 2 wins!");
            } else if (playerBMove.equalsIgnoreCase("P") && playerAMove.equalsIgnoreCase("R")) {
                System.out.println("Paper Covers Rock, Player 2 Wins");
            } else {
                System.out.println("It's a tie!");
            }
            //Ask if they want to play again
            System.out.println("Do you want to play again? (Y/N)");
            String playAgainInput = in.nextLine().toUpperCase();
            //If they entered Y, play again.
            playAgain = playAgainInput.equals("Y");
        }
        //Close input
        in.close();
    }
}