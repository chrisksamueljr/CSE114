
package Labs; 
import java.util.Scanner;

/**
 * 
 * This Program demonstrates how to manipulate 
 * an input from a user.
 * 
 * **/
public class changeMaker {
    public static void main(String[] args) {
        int change, remaining, quarters, dimes, nickels, pennies;
        
        System.out.print("Input change amount (1-99): ");
        Scanner scan = new Scanner(System.in);
        change = scan.nextInt();
        quarters = change / 25;
        remaining = change % 25;
        dimes = remaining / 10;
        remaining = remaining % 10;
        
        nickels = remaining / 5;
        remaining = remaining % 5;
        pennies = remaining;
        System.out.print(quarters + "quarters, " + dimes + " dimes, ");
        System.out.println();
        System.out.println(nickels + "nickels and" + pennies + " pennies");
        
        scan.close();
    }
}