package Strings;


/** Wikipedia: https://en.wikipedia.org/wiki/Palindrome */
class Palindrome {

	public static void main(String[] args) {
		// Store your variables and functions here.
		String[] palindromes = {null, "aba", "123321"};
		for (String s: palindromes) {
		
		}
	}


	/**
	   * Check if a string is palindrome string or not
	   *
	   * @param s a string to check
	   * @return {@code true} if given string is palindrome, otherwise {@code false}
	   */
	
	
	
	 public static boolean isPalindrome(String s) {
		    return (s == null || s.length() <= 1) || s.equals(new StringBuilder(s).reverse().toString());
	}



}


