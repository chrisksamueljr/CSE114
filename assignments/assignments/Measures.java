/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu

/***
Write an application (Class Measures in the file Measures.java) 
that prompts a user and inputs (using a Scanner object) from the user
the radius of a circle as an integer and prints the circle’s diameter, 
circumference and area. These three measures are double values (floating point).
Use the floating point value 3.14159 for the constant π. [You may also use the 
predefined constant Math.PI for the value of π. This constant is more precise 
than the value 3.14159. Class Math is defined in package java.lang. Classes in 
that package are imported automatically in your user space, so you do not need to
import class Math to use it.] Use the following formulas (r is the radius):


***/

package assignments;
import java.util.Scanner;
/**
 *
 * @author Chris Samuel
 */
public class Measures {

    public void getCircumference(){
        System.out.println("Enter the Radius of a Circle");
        Scanner scan = new Scanner(System.in);
        Integer radius = scan.nextInt();
        System.out.println(radius);
} 
}