package Strings;





public class CharactersSame {

	/*Driver Code*/
	public static void main(String[]args) {
		
		System.out.println(isAllCharacterSame(""));
		System.out.println(isAllCharacterSame("aab"));
		System.out.println(isAllCharacterSame("aaa"));
		System.out.println(isAllCharacterSame("11111"));
		System.out.println(isAllCharacterSame("AAA"));
	}
	



/**
 * 
 * isAllCharactersSame() takes a string
 * @ param s the string to check 
 * @return {@code true} if all characters 
 * 		of a string are same, otherwise
 * 		{@code false}
 * **/ 
 
public static boolean isAllCharacterSame(String s) {
	for(int index = 1, length= s.length(); index < length; ++index) {
		if (s.charAt(index) != s.charAt(0)) {return false;
		}
		}
	return true;
}
}