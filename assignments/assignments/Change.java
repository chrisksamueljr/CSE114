/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu


// Write a Java class named Change in a file named Change.java that reads
// from the keyboard an integer representing a monetary amount (in Korean Won :).
// Then, determine the fewest number of each bill and coin needed to represent that 
// amount, starting with the highest (assume that a 50 thousand won note is the 
// largest bill available).
// For example, if the value entered is 77370, then the program should
// print the equivalent amount as:

// Enter a valid amount of payment i KRW 

// NOTES:
// 1 50,000 KRW notes
// 2 10,000 KRW notes
// 1 5,000 KRW notes
// 2 1,000 KRW notes

// COINS:
// 0 500 KRW coins
// 3 100 KRW coins
// 1  50 KRW coins
// 2 10 KRW coins
 

// Note: that you do not need to worry about the singular/plural
// form of the words notes and coins. Just use the plural form. 

// Note that you should also print the notes and coins with 0 amounts.

// Assume the input from the user will be a multiple of 10 since there is nothing 
// less than a 10 KRW coin. Hand in Change.java.
// package assignments;
package assignments;

import java.util.Scanner;
public class Change {
  public static void main (String [] args) {
    int krw_50000_notes, krw_10000_notes, krw_5000_notes, krw_1000_notes;
    int krw_500_coins, krw_100_coins, krw_10_coins, krw_50_coins;
    String welcomeMessage = " 안녕하세요, 유효한 금액을 입력하십시오 : ";
    Scanner scan = new Scanner(System.in);
    System.out.println(" 안녕하세요, 유효한 금액을 입력하십시오 :");
 	int value = scan.nextInt();


    krw_50000_notes = 50000;
    krw_10000_notes = 10000;
    krw_5000_notes =  5000;
    krw_1000_notes = 1000;
    krw_500_coins =  500;
    krw_100_coins = 100;
    krw_10_coins =  10;
    krw_50_coins = 50;

    System.out.println(billCounter(value,krw_50000_notes) + " " + krw_50000_notes + " KRW Notes");
    // 50,000 Notes
    int remaining = (value - (krw_50000_notes * (billCounter(value,krw_50000_notes))));
    
    // 10,000 Notes
    System.out.println(billCounter(remaining,krw_10000_notes) + " " + krw_10000_notes + " KRW Notes");
    remaining = (remaining - (krw_10000_notes * (billCounter(remaining, krw_10000_notes)) ));
     
    // 5000 Notes
    System.out.println(billCounter(remaining,krw_5000_notes) + " " + krw_5000_notes + " KRW Notes");
    remaining = (remaining - (krw_5000_notes * (billCounter(remaining, krw_5000_notes)) ));

    // 1000 Notes
    System.out.println(billCounter(remaining,krw_1000_notes) + " " + krw_1000_notes + " KRW Notes");
    remaining = (remaining - (krw_1000_notes * (billCounter(remaining, krw_1000_notes)) ));   

    // 500 Coins
    System.out.println(billCounter(remaining,krw_500_coins) + " " + krw_500_coins + " KRW Coins");
    remaining = (remaining - (krw_500_coins * (billCounter(remaining, krw_500_coins)) ));

    
     // 100 Coins
    System.out.println(billCounter(remaining,krw_100_coins) + " " + krw_100_coins + " KRW Coins");
    remaining = (remaining - (krw_100_coins * (billCounter(remaining, krw_100_coins)) ));
    
    // 50 Coins
    System.out.println(billCounter(remaining,krw_50_coins) + " " + krw_50_coins + " KRW Coins");
    remaining = (remaining - (krw_50_coins * (billCounter(remaining, krw_50_coins)) ));


    // 10 Coins
    System.out.println(billCounter(remaining,krw_10_coins) + " " + krw_10_coins + " KRW Coins");
    remaining = (remaining - (krw_10_coins * (billCounter(remaining, krw_10_coins)) ));
  }

  private static boolean isDivisibleBy10(int krw_value) {
      int krwAmount = krw_value;
      int divisor = 10;
      return  (krwAmount % divisor == 0.0);
  }
   private static int billCounter(int bankNotes, int denominations) {
		int dollarValue = bankNotes;
		int noteDenomination = denominations;
		return isRealValue(dollarValue/noteDenomination);
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