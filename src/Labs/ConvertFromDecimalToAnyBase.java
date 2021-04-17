package Labs;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** @author Chris Samuel **/
public class ConvertFromDecimalToAnyBase {
	public static void main(String[] args) throws Exception {
		int base;
		int inputDecimal;
		String initialMessage = "Enter the decimal input below: ";
		String enterBaseMessage = "Enter the base below: ";
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(initialMessage);
		
		inputDecimal = Integer.parseInt(bufferedReader.readLine());
		
		
		// This adds a space in the console.
		System.out.println();	
		

		// Enter the decimal below:
		System.out.println(enterBaseMessage);
		
		base = Integer.parseInt(bufferedReader.readLine());
		String displayConvertedBaseMessage = "Value of " + inputDecimal + " in base" + base + " is: " + transformToBase(inputDecimal, base);
		// This adds a space in the console.
		System.out.println();	
		
		System.out.println("Decimal Input" + "is:" + inputDecimal);
		
		System.out.println(displayConvertedBaseMessage);
		bufferedReader.close();
	}
	
	 /**
	   * This method produces a String value of any given input decimal in any base
	   *
	   * @param inp Decimal of which we need the value in base in String format
	   * @return string format of the converted value in the given base
	   */
	  public static String transformToBase(int inp, int base) {
	    ArrayList<Character> charArr = new ArrayList<>();

	    while (inp > 0) {
	      charArr.add(reVal(inp % base));
	      inp /= base;
	    }

	    StringBuilder str = new StringBuilder(charArr.size());

	    for (Character ch : charArr) {
	      str.append(ch);
	    }

	    return str.reverse().toString();
	  }
	  /**
	   * This method produces character value of the input integer and returns it
	   *
	   * @param num integer of which we need the character value of
	   * @return character value of input integer
	   */
	  public static char reVal(int num) {
	    if (num >= 0 && num <= 9) return (char) (num + '0');
	    else return (char) (num - 10 + 'A');
	  }
}
