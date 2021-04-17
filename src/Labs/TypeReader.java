package Labs;

import java.util.Scanner;
	
public class TypeReader {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		String number = scan.nextLine();
		
		long numberInteger = Long.parseLong(number);
			
		// byte = -128 => 127;
		// short = -32768 => 32767;
		// int =  -2147483648 => 2147483647;
		// long = -9223372036854776000 => 2^31 -1;
		
		if(numberInteger >= (-128) && numberInteger <= 127) {
			System.out.println("The integer is a byte");
			
		}
		else if(numberInteger >= (-32768) && numberInteger <= 32768) {
			System.out.println("The integer is a short");
			
		}else if(numberInteger >= (-2147483648) && numberInteger <= 2147483647) {
			System.out.println("The integer is a int");
			
		}else {
			System.out.println("The integer is a long");
			
		}
		scan.close();
	}

}	
