import static java.lang.System.out;
import java.util.Scanner;


public class GroceryList
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.println("Please three items in your grocery list.");
        out.println("Item 1?");
        String item1 = keyboard.next();
        out.println("Item 2?");
        String item2 = keyboard.next();
        out.println("Item 3?");
        String item3 = keyboard.next();

        out.println("Now, please enter the quantity of each item.");
        out.println("How many of " + item1 + "?");
        int A = keyboard.nextInt();
        out.println("How many of " + item2 + "?");
        int B = keyboard.nextInt();
        out.println("How many of " + item3 + "?");
        int C = keyboard.nextInt();

        out.println("Now please enter the price of each item.");
        out.println("How much does " + item1 + " cost?");
        float price1 = keyboard.nextFloat();
        out.println("How much does " + item2 + " cost?" );
        float price2 = keyboard.nextFloat();
        out.println("How much does " + item3 + " cost?");
        float price3 = keyboard.nextFloat();

        out.println("Calculating your grocery bill.");
        out.println("Your total cost is " + ((A*price1)+(B*price2)+(C*price3)) + ".");










    }
}
