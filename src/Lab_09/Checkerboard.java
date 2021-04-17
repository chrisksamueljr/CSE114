
package Lab_09;

import java.util.Arrays;

public class Checkerboard {
    public static void main(String[] args) {
        int checkers_row = 8; int checkers_column = 8;
       
        int[][] checkerboard = getTwoDimenstionalArray(checkers_row,checkers_column);
       
        generateRandomZerosAndOnes(checkerboard);
        
        printCheckboard(checkerboard); 
       
        boolean check = true;
        for (int i = 0; i < 8; i++) {
            int start = checkerboard[i][0];
            check = true;
            for (int k = 1; k < 8; k++) {
                if (checkerboard[i][k] != start) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println("All " + start + " on Row " + i);
            }
        }
        for (int i = 0; i < 8; i++) {
            check = true;
            int start = checkerboard[0][i];
            for (int k = 1; k < 8; k++) {
                if (checkerboard[k][i] != start) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println("All " + start + " on column " + i);
            }
        }
        int start = checkerboard[0][0];
        check = true;
        for (int i = 1; i < 8; i++) {
            if (checkerboard[i][i] != start) {
                check = false;
                break;
            }
        }
        if (check == true) {
            System.out.println("All " + start + " on the main diagonal");
        }
        start = checkerboard[0][7]; // minor diagonal
        check = true;
        int row = 1;
        for (int i = 6; i >= 0; i--) {
            if (checkerboard[row][i] != start) {
                check = false;
                break;
            }
            row++;
        }
        if (check == true) {
            System.out.println("All " + start + "on the minor diagonal");
        }
    }

    // User Defined Methods

    public static int[][] getTwoDimenstionalArray(int rows, int columns) {
       int[][] twoDimensional_array = new int[rows][columns];
       return twoDimensional_array; 
    }

    public static int[][] generateRandomZerosAndOnes(int[][] genericArray) {
        int[][] method_array = genericArray;
        for (int index = 0; index < 8; index++) {
            for (int secondIndex = 0; secondIndex < 8; secondIndex++) {
                method_array[index][secondIndex] = (int)(Math.random() * 2);
            }
        }
        return method_array;
    }

    public static void printCheckboard(int[][] parameterArray) {
        int[][] generic_board = parameterArray;
        for (int index = 0; index < 8; index++) {
            System.out.println(Arrays.toString(generic_board[index]));
        }
    }
}