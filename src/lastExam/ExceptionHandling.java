package lastExam;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to eneter  two integers
         System.out.print("Enter two integers: ");
         int  number1 = input.nextInt();
         int  number2 = input.nextInt();
        try {
            System.out.println(number1 + "/" + number2 + " is " + (number1 /  number2));
        } catch (Exception ex) {
            System.out.println("Exception: an integer " + " cannot be divided by zero ")
        }
        System.out.println(" Execution continues.... ");
    }
}


