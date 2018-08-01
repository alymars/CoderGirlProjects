import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalforSubs = 180;
        int goalForSoup = 70;
        int veggies;
        int burgers;
        int subs;
        int soup;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50.");
        out.println("How many veggies were sold today?");
        veggies = keyboard.nextInt();

        if(veggies >= goalForVeggies) {
            out.println("Meets goal");
        }
        else {
            out.println("Fell short");
        }

        out.println("The sales goal for burgers is 250.");
        out.println("How many burgers were sold today?");
        burgers = keyboard.nextInt();

        if(burgers >= goalForBurgers) {
            out.println("Meets goal");
        }
        else {
            out.println("Fell short");
        }

        out.println("The sales goal for subs is 180.");
        out.println("How many subs were sold today?");
        subs = keyboard.nextInt();

        if(subs >= goalforSubs) {
            out.println("Meets goal");
        }
        else {
            out.println("Fell short");
        }

        out.println("The sales goal for soup is 70.");
        out.println("How many soups were sold today?");
        soup = keyboard.nextInt();

        if(soup >= goalForSoup) {
            out.println("Meets goal");
        }
        else {
            out.println("Fell short");
        }

        if(veggies >= goalForVeggies && burgers >= goalForBurgers && subs >= goalforSubs && soup >= goalForSoup){
            out.println("Met goal of everything!");
        }
    }
}
