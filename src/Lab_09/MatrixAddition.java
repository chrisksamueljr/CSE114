package Lab_09;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dimensions of an rows (n) x columns (m) matrix: ");
        int matrix_rows = scan.nextInt();
        int column_matrix = scan.nextInt();
        double[][] exArray = new double[matrix_rows][column_matrix];
        System.out.print("Enter the values of the 2D array: ");
        for (int row = 0; row < matrix_rows; row++) {
            for (int column = 0; column < column_matrix; column++) {
                exArray[row][column] = scan.nextDouble();
            }
        }
        double[] newArray = totalColumns(exArray);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

        scan.close();
    }

    public static double[] totalColumns(double[][] column_matrix) {
        double[] sumArray = new double[column_matrix[0].length];
        for (int column = 0; column < column_matrix[0].length; column++) {
            for (int row = 0; row < column_matrix.length; row++) {
                sumArray[column] += column_matrix[row][column];
            }
        }
        return sumArray;
    }
}