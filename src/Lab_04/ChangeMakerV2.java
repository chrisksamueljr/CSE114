package Lab_04;


import java.util.Scanner;


public class ChangeMakerV2 {
	public static void main (String [] args) {
		
		int remaining, twenty, ten, five,one, quarter,dime, nickel, penny;
		Scanner scan = new Scanner(System.in);
		System.out.println("Price:");
		double price = scan.nextDouble();
		System.out.println("From: ");
		int from  = scan.nextInt();
		System.out.println("Computer change = " + (from - price) + " = ");
		
	    remaining = (int) ((from-price)*100);
//		from = from*100;
		// twenty
		twenty = billCounter(remaining,2000);
		remaining = remaining - (twenty*2000);
		
		// Tens
		ten = billCounter(remaining,1000);
		remaining = remaining - ten * 1000;
		
		// five
		five = billCounter(remaining,500);
		remaining =  remaining - (five*500);
		
		//one
		one = billCounter(remaining,100);
		remaining =  remaining - (one * 100);
		
		// Quarter
		quarter = billCounter(remaining,25);
		remaining = remaining - (quarter* 25);
		
		//Dime
		dime = billCounter(remaining,10);
		remaining = remaining - (dime* 10);
		System.out.println("Dime "+ dime);
		System.out.println("remaining "+ remaining);
		
		nickel = billCounter(remaining,5);
		remaining = remaining - (nickel * 5);
		System.out.println(nickel);
		penny = billCounter(remaining,1);;
		
		
		
		
		String message = twenty + "x 20 bills, " + ten + "x $10 bills, " + five + "x $5 bills ";
		String message_1 = one + "x $1 bills " + quarter + "x 25c coins " + dime + "x 10c coins,"; 
		String message_2 = nickel + "x 5c coins " + penny + "x 1c coins"; 
				
		System.out.println(message + message_1 + message_2);
		
		scan.close();
	}
	
	
	private static int billCounter(int bankNotes, int denominations) {
		int dollarValue = bankNotes;
		int noteDenomination = denominations;
		System.out.println(dollarValue);
		System.out.println(noteDenomination);
		
		
		return isRealValue(bankNotes / noteDenomination);
	}
	
	
	private static int isRealValue(int someValue) {
		if(someValue < 0) {
			return 0;
		}
		else {
			return someValue;
		}
		}
	}
