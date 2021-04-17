package Labs;



import java.util.Scanner;

public class Identifier {
  public static void main(String[] args) {
	
	System.out.println("Enter an Input: ");
	Scanner scan = new Scanner(System.in);
	String term = scan.nextLine();
	
	
	if(!((term.charAt(0))  >= 'a' && term.charAt(0) <= 'z') ||
			(term.charAt(0) >= 'A' && term.charAt(0) <= 'Z') ||
			term.charAt(0) == '_') {
			System.out.println(" Not a legal identifier");
			return;
	}
	for(int i =1; i <term.length(); i++) {
		// Inside Loop 
			if(!((term.charAt(i))  >= 'a' && term.charAt(i) <= 'z') ||
					(term.charAt(i) >= 'A' && term.charAt(i) <= 'Z') ||
					term.charAt(i) == '_') {
					System.out.println(" Not a legal identifier");
					return;
			}
		}
		// Outside the forLoop
  
	System.out.println("String is a legal identifier");
  }
  
  
}
  
