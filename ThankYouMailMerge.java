import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouMailMerge {

    public static void createThankYou(String name, float amount) {
        out.println("\nDear " + name + ",");
        out.println("\nThank you for your donation! We rely on donor like you to keep our ");
        out.println("organization effective, and you cam through for us.  Your donation of $ " + amount);
        out.println("will help our efforts to make a difference in the world.");
        out.println("\nAs you may know, we are a registered non-profit organization, so your ");
        out.println("donation is tax decuctible. You may use this letter as a receipt for tax ");
        out.println("purposes.");
        out.println("\nThank you again for your support!");
        out.println("\nSincerly,");
        out.println("Paula Jones");
        out.println("YourCharity.org\n");
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Boolean newDonor = true;
        int count = 0;

        out.println("---- Thank You Letters ----");
        out.println("");

        while (newDonor) {
            out.print("Please enter donor's first & last name : ");
            String name = keyboard.nextLine();

            if (name.equals("quit") ) {
                newDonor = false;
            } else {
                out.print("Please enter donation amount for " + name + " : ");
                float amount = keyboard.nextFloat();
                keyboard.nextLine();
                                
                createThankYou(name, amount);

            }

        }
    }

}
