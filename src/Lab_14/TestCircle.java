package Lab_14;

public class TestCircle {
    public static void main(String []args) {
        Circle circle_1 = new Circle();
        circle_1.setRadius(3);
        circle_1.setRadius(-4);
        System.out.println(circle_1.getRadius());// 2.0
        System.out.println(circle_1.getArea()); // 3.14159
        System.out.println(circle_1.getDiameter()); // 2.0

        Circle circle_2 = new Circle(2);
        System.out.println(circle_2.getRadius()); // 4.0
        System.out.println(circle_2.getArea()); // 12.56636
        System.out.println(circle_2.getDiameter()); // 4.0
    

        Circle circle_3 = new Circle(); 
        Circle circle_4 = new Circle();
        Circle circle_5 = new Circle();
        Circle circle_6 = new Circle();

        System.out.println(Circle.count); // 6 returning a int
        System.out.println(Circle.getCount());  // 6.0  returning a double
    }
}