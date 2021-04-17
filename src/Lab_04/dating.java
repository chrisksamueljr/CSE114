package Lab_04;

//import java.util.Date; 
import java.time.YearMonth; 
import java.time.LocalDate; 
import java.util.Scanner;
public class dating { 
	static String months[] =
			{ 
					"Not Valid Month",
					"January",
					"February",
					"March",
					"April",
					"May",
					"June",
					"July",
					"August",
					"September",
					"October",
					"November",
					"December"
			};
	// Function to get day, month, and 
	// year from date 
	public static void
	getDayMonthYear(int month , int year) 
	{ 
	   YearMonth yearMonthObject = YearMonth.of(year, month);
		int daysInMonth = yearMonthObject.lengthOfMonth(); //29
		
	
		String displayMessage;
		displayMessage = (months[month] + " " + year  +" has "+ daysInMonth +" days");
		
		if(month <2 || month > 12){
			System.out.println("Please Enter a Valid Month and Year");
		} else {
			System.out.println(displayMessage);
		}
		
	} 

	
	
	// Driver Code 
	public static void main(String args[]) 
	{ 
		System.out.println("Days In Month in JAVA"); 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a valid year (YYYY))"); 
		int userYear = scan.nextInt();
		System.out.println("Enter a valid Month (MM)) (1 - 12)"); 
		int userMonth = scan.nextInt();
		

		// Function Call 
		getDayMonthYear(userMonth,userYear); 
		scan.close();
	}
	
}
