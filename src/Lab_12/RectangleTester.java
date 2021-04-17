
public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 40, "red");
        Rectangle r3 = new Rectangle(3.5, 35.9, "red");
        System.out.println("Rectangle 1:");
        r1.displayRectangle();
        System.out.println();
        System.out.println("Rectangle 2:");
        r2.displayRectangle();
        System.out.println();
        System.out.println("Rectangle 3:");
        r3.setWidth(100);
        r3.setHeight(20);
        r3.setColor("blue");
        r3.displayRectangle();
    }
}