package Labs;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
import java.util.Scanner;


public class displayConversions {
			
	public static void main(String[] args) {
		String initialMessage = "Enter the decimal input below: ";
		System.out.println(initialMessage);
		Scanner scan = new Scanner(System.in);
		int inputDecimal = scan.nextInt();
		
		
		
		String binary = Integer.toBinaryString(inputDecimal);
		String octal = Integer.toOctalString(inputDecimal);
		String hexadecimal = Integer.toHexString(inputDecimal);
		
		System.out.println("Number in binary: "+ binary);
		System.out.println("Number in octal: "+ octal);
		System.out.println("Number in hexadecimal: "+ hexadecimal);
		
		scan.close();
}

}
