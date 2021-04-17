package Lab_04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate; 

public class DaysInMonth {
	
	public static void main(String[] args) {
		int month_digit, year_digit;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the month based on 1-12");
		System.out.println(" Month | November = 11 For Example");
		System.out.println(" Year | YYYY = 1998");
		
		month_digit = scan.nextInt();
		year_digit = scan.nextInt();
		Date thisDate = new Date();
//		LocalDate currentDate = LocalDate.parse((CharSequence) thisDate); 

		
		
//		System.out.println(currentDate);
//		SimpleDateFormat dateForm = new SimpleDateFormat("MM/DD/YYYY");
		System.out.println("User Input");
		System.out.println(" Month | " + month_digit);
		System.out.println(" Year |  "  + year_digit);
//		System.out.println(dateForm.format();
	}

}
