import java.util.Scanner;

public class MuplicationTables {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Multplication Tables");
        System.out.println("How large would like to see them?");

        int size = keyboard.nextInt();

        for (int a = 0; a <= size; a++) {

            for(int b = 0; b <= size ; b++) {
                System.out.println(a + "x" + b + "=" + (a*b));
            }
        }
    }
}
