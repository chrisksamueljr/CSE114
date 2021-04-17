package Lab_10;

import java.util.Scanner;
public class Triangle {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");

        double values[][] = new double[3][2];

        values[0][0] = scan.nextDouble();
        values[0][1] = scan.nextDouble();
        values[1][0] = scan.nextDouble();
        values[1][1] = scan.nextDouble();
        values[2][0] = scan.nextDouble();
        values[2][1] = scan.nextDouble();

        System.out.println(getTriangleArea(values));
        scan.close();
    }

    public static double getTriangleArea(double[][]points) {
        double side1x = points[1][0] - points[1][0];
        double side1y = points[1][0] -  points[1][0];
        double side1 = (Math.sqrt((side1x * side1x) + (side1y * side1y))); 

        double side2x = points[2][0] -  points[0][0];
        double side2y = points[2][1] -  points[1][0];
        double side2 = (Math.sqrt((side2x * side2x) + (side2y * side2y))); 

        double side3x = points[2][0] - points[0][0];
        double side3y = points[2][1] - points[0][1];
        double side3 = (Math.sqrt((side3x * side3x) + (side3y * side3y))); 

        double halfPerimeter = (side1 + side2 + side3) / 2;

        double heron1 = halfPerimeter - side1;
        double heron2 = halfPerimeter - side2;
        double heron3 = halfPerimeter - side3;

        double heronFinal = Math.sqrt(halfPerimeter * heron1* heron2* heron3);

        if (Double.isNaN(heronFinal)) {
            return 0.0;
        }
        return heronFinal;
        
        // sqrt( HalfPerimeter * helfPerimeter - side1 * halfPerimeter - side2 * halfPerimeter - side3)
    }
}
