package Lab_08;

public class NumberSystems {
    // Write a function that takes two parameters and returns and Integer
    public static int convertFromBaseToDecimal(int base, String decimalString) {
        return Integer.parseInt(decimalString, base);
    }


    // Write a function that takes two parameters and returns and Integer
    public static String convertFromDecimalToBase(int base, int dec) {
        return Integer.toString(base, dec).toUpperCase();
    }

    // Write a function that takes two parameters and returns and Integer
    // return a integer  from base 2 to decimal 
    public static int convertFromBaseToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }


    // Write a function that takes two parameters and returns and Integer
    // Return a string to from integer decimal to hex decimal
    public static String convertFromDecimalToHex(int a_number) {
        return Integer.toHexString(a_number).toUpperCase();
    }


    // Write a function that takes two parameters and returns and Integer
    // return a integer from binary  to decimal
    public static int convertFromBinaryToDecimal(String b) {
        return Integer.parseInt(b,2);
    }
    
    // Convert a Hexadecimal to decimal
    public static int convertFromHexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String [] args) {
        // Output all functions to a seperate method.
        System.out.println(convertFromBaseToDecimal(5,"20")); // => 10
        System.out.println(convertFromDecimalToBase(10,5));  // => "20"
        System.out.println(convertFromBinaryToDecimal("1010")); //  => 10
        System.out.println(convertFromDecimalToHex(161)); // =>  "A1"
        System.out.println(convertFromHexadecimalToDecimal("A1")); // => 161
    } 
}
