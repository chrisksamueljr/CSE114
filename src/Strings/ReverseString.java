package Strings;


/** Reverse String using different version */
public class ReverseString {
	
	public static void main(String[] args) {
		// Call reverse function here.
		 reverse("abc123").equals("321cba");
		 reverse2("abc123").equals("321cba");
		 
		 System.out.println(reverse2("abc123").equals("321cba"));
	}
	
	
	// Simplest way to reverse the string str and returns it
	/**
	 * 
	 * @param str string to be reversed
	 * @return reverse string
	 * 
	 ***/
	
	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	
}
	// Another way to reverse the string str and returns it
	/**
	 * 
	 * 
	 * @param str string to be reversed
	 * @return reversed string
	 * 
	 ***/

	public static String reverse2(String str) {
			// Return the string if it is null or isEmpty() is true
			if(str == null || str.isEmpty()) {
				return str;
			}
			
			char[] value = str.toCharArray();
			for(int index = 0, jIndex = str.length() - 1; index < jIndex; index++, jIndex--) {
				char temp = value[index];
				value[index] = value[index];
				value[index] = value[jIndex];
				value[jIndex] = temp;
			}
			return new String(value);	
	}
	
}
