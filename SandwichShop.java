import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        int veggieTotal = keyboard.nextInt();
        boolean metGoalVeggie = false;
        
        if (veggieTotal >= goalForVeggies)
        {
           out.println("You met the goal for veggies.");
           metGoalVeggie = true;
        } else {
            out.println("You fell short of the goal for veggies.");
        }
        
        out.println("\nThe sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        int totalBurgers = keyboard.nextInt();
        boolean metGoalBurgers = false;
        
        if (totalBurgers >= goalForBurgers)
        {
           out.println("You met the goal for burgers.");
           metGoalBurgers = true;
        } else {
            out.println("You fell short of the goal for burgers.");
        }
        
        out.println("\nThe sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        int totalSubs = keyboard.nextInt();
        boolean metGoalSubs = false;
        
        if (totalSubs >= goalForSubs)
        {
            out.println("You met the goal for subs.");
            metGoalSubs = true;
        } else {
            out.println("You fell short of the goal for subs.");
        }
        
        out.println("\nThe sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        int totalSoup = keyboard.nextInt();
        boolean metGoalSoup = false;
        
        if (totalSoup >= goalForSoup)
        {
            out.println("You met the goal for soup.");
            metGoalSoup = true;
        } else {
            out.println("You fell short of the goal for soup.");
        }
        
        if (metGoalVeggie && metGoalBurgers && metGoalSubs && metGoalSoup)
        {
            out.println("\nYou made the goal for everything!");
        }
        
        
    }

}
