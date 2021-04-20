public class Triangle {
    public Triangle(double side1, double side2, double side3) {
        // Lets create a try and catch block
        try {
            // less than greater than 
            if(side1 + side2 <= side3) {
                throw new Exception("2 sides of a triangle do not sum up to be greater than side 3");
            }if(side1 + side3 <= side2) {
                throw new Exception("2 sides of a triangle do not sum up to be greater than side 3");
            }if(side3 + side2 <= side1) {
                throw new Exception("2 sides of a triangle do not sum up to be greater than side 3");  
            }
        } catch(Exception IllegalTriangleException) {
            System.out.println(IllegalTriangleException);
        }
    } 
    public static void main(String [] args) {
        Triangle t = new Triangle(6, 1, 1);System.out.println("asidoujhasd");
    }
}










