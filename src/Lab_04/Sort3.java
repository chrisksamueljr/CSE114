package Lab_04;


import java.util.Arrays;
import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		int number_one, number_two, number_three;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three(3) Integers ");
		
		number_one = scan.nextInt();
		number_two = scan.nextInt();
		number_three = scan.nextInt();
		
		int [] list_of_ints = {number_one, number_two, number_three};
		Arrays.sort(list_of_ints);
		System.out.println(Arrays.toString(list_of_ints));
		scan.close();
	}
	

}