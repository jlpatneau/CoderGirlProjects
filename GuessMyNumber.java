import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static int getRandomNum(long seed, int upper) {
        Random dice =  new Random(seed);
        int diceRoll = dice.nextInt(upper);
        return diceRoll;
    }

    public static int getGuessNum(int min, int max) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Guess: ");
        int guess = keyboard.nextInt();
        keyboard.nextLine();

        if (guess < min || guess > max) {
            System.out.println("That number is not between " + min + " and " + max + ". Try again");
            getGuessNum(min, max);
        }
        return guess;
    }

    public static Boolean checkNumber(int number, int min, int max, long seed, String name) {
        Boolean guessAgain = true;
        Boolean keepPlaying = true;
        Scanner keyboard = new Scanner(System.in);

        //Get the random number
        int randomNum = getRandomNum(seed,max);
        //System.out.println("the random number is " + randomNum );

        do {
            if (number == randomNum) {
                guessAgain = false;
                System.out.print("Congratulations " + name + " you guessed correctly! ");
                System.out.println("My number was " + randomNum );
                System.out.print("\nDo you want to play again? (Y/N) ");
                String yesNo = keyboard.nextLine();
                
                if (yesNo.equalsIgnoreCase("Y") || yesNo.equalsIgnoreCase("yes")) {
                    keepPlaying = true;
                } else {
                    keepPlaying = false;
                }
            } else {
                if (number < randomNum) {
                    System.out.println("My number is higher, guess again.");
                    number = getGuessNum(min, max);
                } else {
                    if (number > randomNum) {
                        System.out.println("My number is lower, guess again.");
                        number = getGuessNum(min, max);
                    } else {
                        System.out.println("Invalid guess, try again");
                        number = getGuessNum(min, max);
                    }}}
        } while (guessAgain) ;
        
        return keepPlaying;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Boolean keepPlaying = true;
        //int seed = 2;
        
        //Level 2
        System.out.print("What is player 1's name? ");
        String name1 = keyboard.nextLine();
        System.out.print("What is player 2's name? ");
        String name2 = keyboard.nextLine();

        String name = name1;
        do {
            System.out.println("I'm thinking of a number between 1-100.  What is it? ");
            int min = 1;
            int max = 100;
            int guess = getGuessNum(min, max);
            long seed = System.currentTimeMillis();

            keepPlaying = checkNumber(guess, min, max, seed, name);
            //seed++;
        } while (keepPlaying);

    }
}
