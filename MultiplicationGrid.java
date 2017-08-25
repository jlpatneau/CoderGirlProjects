import java.util.Scanner;

//This class will print out muliplication table grid up to the
//requested size based on user input starting with 0x0 and
//a max size of 20x20
public class MultiplicationGrid {
    public static void printHeading (int max) {
        System.out.print("    "); 
        for (int y = 0; y <= max; y++) {
            addSpaces(y);
            System.out.print(y);
            
        }
    }

    public static void addSpaces (int number) {
        if (number < 10) {
            System.out.print("   "); //3 spaces for single digit number
        } else if (number < 100) {
            System.out.print("  "); //2 spaces for double digit number
        } else {
            System.out.print(" "); //1 space for triple digit number
        }
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size = 20;
        System.out.println("Welcome to Multiplication Tables");
        System.out.print("\nHow large of a table would you like to see? (up to 20) ");
        int max = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();

        if (max > size) {
            System.out.println("20 is the maximum table");
        } else {
            printHeading(max);
            for (int x = 0; x <= max; x++) {
                System.out.print("\n");
                addSpaces(x);
                System.out.print(x);
                for (int y = 0; y <=max; y++) {
                    int product = x * y;
                    addSpaces(product);
                    System.out.print(product);  
                }
            }
        } 

    }
}