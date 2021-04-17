package Lab_04;

import java.util.Scanner;

public class TipCalculator {
	public static void main (String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Subtotal $");
	double subtotal = scan.nextInt();
	double tip = 5.00;

	 
	double total = processTip(subtotal, tip);
	

	
	String totalCost = ("The total is " + total);
	String totalTipMessage;
	if(subtotal <= 30) {
		totalTipMessage = ("The tip is " + tip);
		System.out.println(totalTipMessage);
	};
	if(subtotal > 30) {
		totalTipMessage = ("The tip is 15% of the subtotal");
		System.out.println(totalTipMessage);
	};

	System.out.println(totalCost);
	
	//	System.out.println("From: ");
//	double tip  = scan.nextDouble();
//	System.out.println("Computer change = " + (from - price) + " = ");
	scan.close();
}
	private static double processTip(double value, double tiplimit) {	
		double subtotal = value;
		double tip = tiplimit;
		double tipPercentage = 0.15;
			if(subtotal < 30 && subtotal > 0.00) {
				// the tip will be five dollars
				return (subtotal + tip);
			} else {
				// take a percentage
			tip = (subtotal * tipPercentage);
			return 	(subtotal + tip);
			}
	}
}