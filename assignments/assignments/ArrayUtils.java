 package assignments;
/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu

import java.util.Arrays;

// import java.util.*;
public class ArrayUtils {
    public static void main(String [] args) {
 int[] test_case_1 = {1,2,3,4,5};
 int[] test_case_2 = {5,4,3,2,1};
 int[] test_casae_3 = {1,2,4,4,5};
// In your main call contains with the array obtained 
// in step 2 above and 12 as the second argument, and 
// prints the result.
int[] localVariable = randomArray(10,21);
// print(localVariable);
 System.out.println(contains(test_case_2, 4));

// In the main method
// print the average of all the numbers in the array 
// that you obtained in step 2. To compute the average,
// you must use arraySum that you defined earlier. 
// Make sure to add annotations to the output so that
// it will be meaningful for people seeing the program run.

}

/**
   * Define a method named randomArray
   *
   * @param size    (int)
   * @param upperLimit (int)
   * @return Array
   */
    public static int[] randomArray(int size , int upperLimit) {
        int[] someRandomArray = new int[size];
        return someRandomArray;
    };
   /**
   * Define a method named print
   *
   * @param arrayOfIntegers (int)
   * @return (Array)
   */
    public static void print(int[] arrayOfIntegers) {
        // for (int each_element_in : arrayOfIntegers)
        //     System.out.println(each_element_in);
        String printToConsole = Arrays.toString(arrayOfIntegers);
        System.out.println(printToConsole);
    }

    
   /**
   * Define a method named arraySum
   *
   * @param arrayOfIntegers (Array)
   * @return sumOfAllElementsInArray
   */
    public static int arraySum(int[] method_array) {
        int totalSum = 0;
        for(int each_element_in : method_array)
            totalSum += method_array[each_element_in];
        return totalSum;
    }
  



  /**
   * Define a method named contains
   *@param arrayOfIntegers (Array)
   * @param aSingleInteger (int)
   * @return returns the INDEX of the array where the first occurence of the second argument is found.
    * return -1 if not found.
   */
    public static int contains(int[] arrayOfIntegers, int singleInteger) {
        int[] localVariable_array = arrayOfIntegers;
        int localVariable_Integer = singleInteger;
        int notFoundFlag = -1;
        int integerFound = 0;
        for(int each_element_in : localVariable_array) {   
            if(each_element_in == localVariable_Integer) {
                integerFound = each_element_in;     
            } else {
                integerFound = notFoundFlag;
            }
        }     
        return integerFound;  
        }
         
   /**
   * Define a method named countMultiplesOf
   * @param arrayOfIntegers (Array)
   * @param arrayOfIntegers (Array)
   * @return sumOfAllElementsInArray
   */  
}
