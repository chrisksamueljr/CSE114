/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu




// Write an application (named Shapes.java) 
// that displays your semester schedule in
// the console using System.out.print statements
// similar to the following schedule:


import java.util.Scanner;
import  java.util.Arrays;
/**
 *
 * @author Chris Samuel
 */
public class Shapes {
    public  String welcome = this.shapesName + " schedule:\n";
    private String shapesName;
    private String courseStartTime;
    private String courseCode;
    private String validSchoolDays;

    
    public Shapes()
    {
        System.out.println("Parent Constructor with no parameter");        
    }        

    public Shapes( String pshapesName, 
                    String pcourseStartTime, 
                    String pcourseCode,
                    String pvalidSchoolDays)
    {
	System.out.println("Parent Constructor with 4 parameters");

	shapesName = pshapesName;
	courseStartTime = pcourseStartTime;
	courseCode = pcourseCode;
    validSchoolDays = pvalidSchoolDays;

    }

    public void displayMemInfo() {

	System.out.println(shapesName + " schedule:");
    System.out.println(validSchoolDays);
	System.out.println(courseStartTime);
	System.out.println(courseCode);
    }

    
    //abstract public void calculateAnnualFee();
    
}
