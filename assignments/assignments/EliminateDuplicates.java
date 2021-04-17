package assignments;

/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EliminateDuplicates {
    public static void main(String [] args) throws Exception {

    //   // Test Case are below
    //  test_cases("ArrayUtils","ArayUtils");
    //  test_cases("Stony Brook University", "Stony BrkUives");
    //  test_cases("This is a test sentence.", "This atenc.");
    //  test_cases("Cookies", "Cokies");
    //  test_cases("Rokkenjima", "Rokenjima");

      
      
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String userInputString = bufferedReader.readLine();

      

        System.out.println("Actual string is: " + userInputString);
        System.out.println(eliminateDuplicates(userInputString));
    
        bufferedReader.close();
    }

    /**
    *
    * @param method_string 
    * return  a copy of the argument str after eliminating all duplicates
    */

    
    public static String eliminateDuplicates(String method_string) {
        if (method_string == null || method_string.isEmpty()) {
            return method_string;
          }
      
          StringBuilder stringBuilder = new StringBuilder();
          int iterator = method_string.length();
      
          for (int index = 0; index < iterator; index++) {
            if (stringBuilder.toString().indexOf(method_string.charAt(index)) == -1) {
                stringBuilder.append(String.valueOf(method_string.charAt(index)));
            }
          }
      
          return stringBuilder.toString();
        }

        public static Boolean test_cases(String stringCase, String expectedCase) {
          System.out.print(eliminateDuplicates(stringCase) + " ");
          System.out.println(expectedCase);
          return (eliminateDuplicates(stringCase) == expectedCase);
        }
    }