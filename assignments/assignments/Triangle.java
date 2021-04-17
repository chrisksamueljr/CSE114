package assignments;

/* Chris Samuel */
/* SBU ID: 100946505 */
// chris.samuel@stonybrook.edu



import java.util.Scanner;

public class Triangle {
    public static void main(String [] args ){
        Scanner scan = new Scanner(System.in);

		System.out.println("Entar value for side 1:");
    	int side1 = scan.nextInt();

		System.out.println("Entar value for side 2:");
	    int side2 = scan.nextInt();
        
		System.out.println("Entar value for side 3:");
        int side3 = scan.nextInt();

        // System.out.println(side1 + side2 + side3);
        System.out.println(analzyeTriangle(side1,side2,side3));
    }

    private static String analzyeTriangle(int one, int two, int three) {
       int side_one = one;
       int side_two = two;
       int side_three = three;
       if( isEquilateral(side_one,side_two,side_three)) {
           return "Output Equilateral";
        } else if(isIsosceles(side_one,side_two,side_three)) {
            return "Output: Isosceles";
           } else {
               return "Output: Invalid Input";
           }
       }
    }

   private static boolean isIsosceles(int one, int two, int three) {
       // A triangle where no angle is equal
       int side_one = one;
       int side_two = two;
       int side_three = three;
       int addSides = side_one + side_two + side_three;
         if(!isEquilateral(side_one,side_two,side_three)) {
             return ((addSides/side_one == side_two) ||  ((addSides/side_one == side_three));
       }; 

   }
   
   private static boolean isEquilateral(int one, int two, int three) {
       int side_one = one;
       int side_two = two;
       int side_three = three;
       int addSides = side_one + side_two + side_three;
       return (addSides/side_one == side_one);
   }
}