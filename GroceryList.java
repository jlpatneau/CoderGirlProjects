import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? "); 
        String item1 = keyboard.nextLine();
        out.print("Item 2? ");
        String item2 = keyboard.nextLine();
        out.print("Item 3? ");
        String item3 = keyboard.nextLine();
        
        out.println("\nNow, please enter the quantity of each item.");
        out.print("How many " + item1 + "? ");
        int item1qty = keyboard.nextInt();
        out.print("How many " + item2 + "? ");
        int item2qty = keyboard.nextInt();
        out.print("How many " + item3 + "? ");
        int item3qty = keyboard.nextInt();
        
        out.println("\nNow, please enter the price of each item.");
        out.print("How much does one " + item1 + " cost? ");
        float item1price = keyboard.nextFloat();
        out.print("How much does one " + item2 + " cost? ");
        float item2price = keyboard.nextFloat();
        out.print("How much does one " + item3 + " cost? ");
        float item3price = keyboard.nextFloat();
        
        out.println("\nCalculating your grocery bill.");
        float totalCost = (item1qty * item1price) + (item2qty * item2price) + (item3qty * item3price);
        out.println("Your total cost is " + totalCost);
    }
}