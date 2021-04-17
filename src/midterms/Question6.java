package midterms; 

public class Question6 {
    public static void main(String[] args) {
          new Circle9();
    }
}
public abstract class GeometricObject {
    protected GeometricObject() {
          System.out.print("A");
    }
    protected GeometricObject(String color, boolean filled) {
          System.out.print("B");
    }
}
public class Circle9 extends GeometricObject {
    /** Default constructor */
    public Circle9() {
          this(1.0);
          System.out.print("C");
    }
    /** Construct circle with a specified radius */
    public Circle9(double radius) {
          this(radius, "white", false);
          System.out.print("D");
    }
    /** Construct a circle with specified radius, filled, and color */
    public Circle9(double radius, String color, boolean filled) {
          super(color, filled);   
      System.out.print("E");
  }
}
