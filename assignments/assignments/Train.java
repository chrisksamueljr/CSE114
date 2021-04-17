/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu


/***
 * 
 * 
 * 
 *  

Write a Java class named Train in a file named Train.
java that reads an integer distance and prints the fare according 
to the following fare table:

First 50 kms:3$/km
51-100 kms:2$/km
>100 kms:1$/km
Sample Runs:
Distance:80
Output: $210 (50*3+30*2)
Distance:160
Output: $310 (50*3+50*2+60*1)
 */

package assignments;
import java.util.Scanner;


public class Train {
    public static void main(String[] args) {
        int output =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value for desired distance: ");
        int distance = scan.nextInt();
        int[] numbers = new int[distance];
        int totalFee = 0;
        
        // and array starts at zero.
        // Create an array that is the length of the value the user inputs
        for(int index = 0; index <= (numbers.length-1); index++) {
            // between 0 to 50
            if(index >= 0 && index <= 49) {
                numbers[index] = 3;
            }
            // between 50 100
            else if(index >=50  && index <= 99) {
                numbers[index] = 2;
            }
            // more than 100 
            else if(index > 99){
                numbers[index] = 1;
            }
         
        }
     
        for(int kilometer: numbers) {
            totalFee += kilometer;
        }
        System.out.println("Distance: " + distance);
        System.out.println("Output: " + totalFee);
        

        
    }
    
}