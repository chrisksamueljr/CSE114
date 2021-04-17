package Labs;

import java.util.Scanner;

public class status_dashboard {
	public static void main(String[]args) {
		// Initial Declarations
		
		Scanner scan = new Scanner(System.in);
		
		
		double minutes;
		double miles_per_hour;
		double miles_per_gallon;
		
		System.out.println("What is the number of minutes");
		minutes = scan.nextDouble();
		
		System.out.println("What is the miles per hour");
		miles_per_hour = scan.nextDouble();
		
		System.out.println("What is the miles per gallon?");
		miles_per_gallon = scan.nextDouble();
		
		System.out.println(minutes);
		System.out.println(miles_per_hour);
		System.out.println(miles_per_gallon);
		
		
		double gasoline_consumption_in_gallons = (minutes/60) * miles_per_hour * (1/miles_per_gallon);
		System.out.println("Consumed gas for the period(in gallons): " + gasoline_consumption_in_gallons);
		
		scan.close();
	}
}
