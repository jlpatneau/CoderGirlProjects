import java.util.Scanner;
import java.util.Random;

public class NewGuessNumber {
    public static int getRandom (int upper) {
        long seed = System.currentTimeMillis();
        Random dice =  new Random(seed);
        int diceRoll = dice.nextInt(upper);
        return diceRoll;
    }

    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.");
        System.out.print("What is player 1's name? ");
        String player1 = keyboard.nextLine();
        System.out.print("What is player 2's name? ");
        String player2 = keyboard.nextLine();

        int randomNumber = getRandom(100);

        boolean gameover = false;
        boolean firstPlayer = true;
        int p1cnt = 0;
        int p2cnt = 0;
        String name = player1; //player 1 starts the game
        String playAgain;

        do {
            System.out.print(name + " what is your guess? ");
            int guess = keyboard.nextInt();
            keyboard.nextLine();

            if (guess == randomNumber) {
                System.out.println(name + " wins! My number was " + randomNumber);
                p1cnt = 0; //reset guess counts when game over
                p2cnt = 0;
                System.out.print("Do you want to play again? (yes/no) ");
                playAgain = keyboard.nextLine();
                if (playAgain.equalsIgnoreCase("yes")) {
                    randomNumber = getRandom(100);
                } else {
                    System.out.println("Thanks for playing!");
                    gameover = true;
                }

            } else if (guess < randomNumber) {
                System.out.println(name + ", your guess is too low.  End of your turn.");

                if (firstPlayer) {
                    p1cnt++;
                    firstPlayer = false;
                    name = player2;
                } else {
                    p2cnt++;
                    firstPlayer = true;
                    name = player1;
                }
            } else  {
                System.out.println(name + ", your guess is too high.  End of your turn.");

                if (firstPlayer) {
                    p1cnt++;
                    firstPlayer = false;
                    name = player2;
                } else {
                    p2cnt++;
                    firstPlayer = true;
                    name = player1;
                }
            }
            if (p1cnt == 5 && p2cnt == 5) {
                System.out.println("Game over, you lost! You ran out of guesses.");
                System.out.println("My number was " + randomNumber);
                System.out.println();
                gameover = true;
            }
        } while (!gameover);
    }
}