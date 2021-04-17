package Labs;

import java.util.Scanner;

/** Converting a Temperature from Celsius to Fahrenheit  **/

public class TempConverter {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius");
		double celsiusTemp = scan.nextDouble();
		
		double fahrenheitTemp = (9.0/5) * celsiusTemp + 32;
		
		System.out.println("The Fahrenheit temperature is "+ fahrenheitTemp);
	}

}
