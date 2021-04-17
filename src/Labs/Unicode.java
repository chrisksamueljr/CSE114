package Labs;

import java.util.Scanner;

public class Unicode {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a unicode");
		String codes = scan.next();
	for(int i = 0; i < codes.length(); i++) {
		char character = codes.charAt(i);
		int convertToString = character;
		 System.out.println(convertToString);
		}
	}
}
