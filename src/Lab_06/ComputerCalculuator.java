package Lab_06;

import java.util.Scanner;

public class CentralProcessingUnitCalculuator {
	public static void main(String [] args) {

		double disk_size = 0.0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a Central Processing Unit: (Intel or AMD)");
		String CentralProcessingUnit = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Enter the disk type: (SDD | Solid State Drive or HDD | Hard Disk Drive ) ");
		String diskType = scan.nextLine();

		System.out.print("Enter the ghz: ");
		double ghz = scan.nextDouble();
		
		System.out.println();
	
	
		System.out.println("Enter the disk size: ");
		double gigs = scan.nextDouble();
		
		int correct = 1;
		double price = 1000;
		
		boolean invalid = false;

		// CentralProcessingUnit IF Statement
		if(CentralProcessingUnit.equals("Intel")) {
			price = price + 200;
		} else if(CentralProcessingUnit.equals("AMD")) {
			price = price + 175;
		} else {
			invalid = true;
		}
		
		
		// GHZ IF Statement
		if(ghz >= 2) {
			price = price + 150;
		} else if(ghz >= 1) {
			price = price + 80;
		} else {
			invalid = true;
		}
		
		
		// DISK TYPE IF STATEMENT
		if(diskType.equals("SSD")) {
			price = price + 225;
		} else if(diskType.equals("HDD")) {
			price = price + 100;
		} else {
			invalid = true;
		}
		

		// DISK SPACE IF STATEMENT
		if(invalid == true) {
			price = price + ((int)gigs * 2);
		} else {
			invalid = true;
		}
			
		price+=2*disk_size;
	    float incorrect = (-1.0);
		// PRINTS
		String invalidMessage = "\nThe total price of the CentralProcessingUnit is";
		if(invalid == true) {
			System.out.println(incorrect);
		} else {
			System.out.println(price);
		}
		
		
		
	}
}
