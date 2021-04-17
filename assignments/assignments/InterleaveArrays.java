package assignments;
/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu

import java.util.Arrays;
public class InterleaveArrays {
    public static void main(String [] args) {

       int[] test_case1 = {1,3,5,7,9};
    
       int[] test_case2 = {2,4,6,8,10};
       System.out.println(Arrays.toString(isInterleave(test_case1, test_case2)));
    }   
    public static int[] isInterleave(int[] first_array, int[] second_array) {
        int totalElements = first_array.length + second_array.length;
        int[] interleavedArray = initializedArray(10);
            for(int firstIndex = 0; firstIndex < first_array.length; firstIndex++) {
        }
            return interleavedArray;
    }

public static int[] initializedArray(int array_size) {
   int[] initialized_array = new int[array_size];
   return initialized_array;
}
}