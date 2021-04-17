package Labs;


import  java.util.Scanner;

public class DiscountSeller {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		String message1 = " How many items are you going to buy?: ";
		String message2 = " What is the price?: ";
		
		
		System.out.print(message1);
		int quantity = scan.nextInt();	
		
		
		System.out.println(message2);
		double price = scan.nextDouble();
		
		double discount;
		discount = 0;
		
		
		if(quantity > 10 &&  quantity < 20) {
			discount = 0.2;
		}
		else if(quantity > 10 && quantity < 50) {
			discount = 0.3;
		}
		else if(quantity > 20 && quantity < 50) {
			discount = 0.4;
		}
		else if(quantity > 50 && quantity < 100) {
			discount = 0.5;
		}
		else if(quantity >= 100) {
			discount = 0.5;
		}
		
		String outputDiscount = "The discount is " + discount *100 + "%";
		String outputDiscountPrice = "The discounted price is $" + (price * discount);
		String outputTotalPrice = "The total price is $" + ((price - price * discount) * quantity);
		String outputDiscountedAmountPerUnit = "The discounted amount per unit is $" + ((price * discount));
		
		System.out.println(outputDiscount);
		
		System.out.println(outputDiscountedAmountPerUnit);
		System.out.println(outputDiscountPrice);
		System.out.println(outputTotalPrice);
		
	
	
	}
}
