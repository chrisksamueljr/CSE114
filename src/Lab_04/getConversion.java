package Lab_04;
import java.util.function.DoubleBinaryOperator;
import java.util.Scanner;

public class getConversion {

	public static void main(String[] args) {
	
	double convertToPounds = 2.20462;
	double convertToKilometers = 1.609934;

	boolean flag = true;
	Scanner scan = new Scanner(System.in);
	
	double quantity;
	
	while(flag)
	{
		System.out.println("A - convert pounds to kilos");
		System.out.println("B - convert  kilos to pounds");
		System.out.println("C - convert kilometers to miles");
		System.out.println("D - convert miles to kilometers");
		System.out.println("E - Leave");
		System.out.println("Enter your option (A-E)");

		String option = scan.next();
		
		if(option.equals("A"))
		{
			System.out.println("Enter the quantity in pounds: ");	
			quantity=scan.nextDouble();
			System.out.println(divide(quantity, convertToPounds ));
		}
		else if(option.equals("B"))
		{
			System.out.println("Enter the quantity in kilos");
			quantity=scan.nextDouble();
			System.out.println(multiply(quantity, convertToPounds));
			
		}	
		else if(option.equals("C"))
		{
			System.out.println("Enter the quantity in kilometers");
			quantity=scan.nextDouble();
			System.out.println(divide(quantity,convertToKilometers));
		}
		else if(option.equals("D"))
		{
			System.out.println("Enter the quantity in miles");
			quantity=scan.nextDouble();
			System.out.println(multiply(quantity,convertToKilometers));
		}
		else
		{
			System.out.println("Exiting....");
			flag = false;
			scan.close();
			System.out.println("Goodbye");
			break;
			
		}
		
	}
	/**
	   * Convert any radix to decimal number
	   *
	   * @param s the string to be convert
	   * @param radix the radix
	   * @return decimal of bits
	   * @throws NumberFormatException if {@code bits} or {@code radix} is invalid
	   */

	
}
	private static double divide(double amount, double conversionRate) {
		double quantity = amount;
		double rate = conversionRate;
		
			return lambdaDivisor.applyAsDouble(quantity,rate);
	}
	private static double multiply(double amount, double conversionRate) {
		double quantity = amount;
		double rate = conversionRate;
		
			return lambdaMultiplier.applyAsDouble(quantity,rate);
	}
	private static DoubleBinaryOperator lambdaDivisor = (x, y) -> x / y;
	
	private static DoubleBinaryOperator lambdaMultiplier = (d, g) -> d / g;
	
}
