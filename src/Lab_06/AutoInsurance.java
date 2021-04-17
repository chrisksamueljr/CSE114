package Lab_06;
import java.util.Scanner;

public class AutoInsurance {
	public static void main(String [] args) {
		
		double premium = 0;
		int age = 0;
		String gender = "";
		System.out.println("enter the info: ");
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		String prem = line.substring(0, line.indexOf(','));
		line = line.substring(line.indexOf(',')+ 2);
		premium = Double.parseDouble(prem);
		String ag = line.substring(0, line.indexOf(','));
		line = line.substring(line.indexOf(',') + 2);
		age = Integer.parseInt(ag);
		gender = line;
		
		// Series of if-else Condition
		// Between 18 and 21
		if(age >= 18 && age < 21 && gender.equals("\"Male\"")) {
			premium = premium;
		}
		else if(age >= 18 && age < 21 && gender.equals("\"Female\"")) {
			premium = premium * 0.9;
		}
		else if(age >= 18 && age < 30) {
			premium = premium * .75;
		}
		else if(age >= 21 && age < 30 && gender.equals("\"Female\"")) {
			premium = premium * 0.75;
		}
		else if(age >= 30 && age < 60 && gender.equals("\"Male\"")) {
			premium = premium * 0.60;
		}
		else if(age >= 18 && age < 21 && gender.equals("\"Female\"")) {
			premium = premium * 0.7;
		}
		else if(age >= 60) {
			premium = premium;
		}
		else {
			premium = -1;
		}
		System.out.println(premium);
		scan.close();
		
		
	}
}
