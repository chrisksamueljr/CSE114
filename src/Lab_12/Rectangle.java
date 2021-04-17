/**
 * 
 * Use the following UML Editors to develop UML diagrams for your classes:
 * 
 * - https://www.draw.io (nothing to be downloaded, just run in the browser,
 * save the diagrams in Google Drive): use the UML tools
 * 
 * - download a UML editor, such as Violet (you can download the .jar file and
 * run it with java -jar violet.jar):
 * http://alexdp.free.fr/violetumleditor/page.php
 * 
 * Note: there are other UML tools such as Visual Paradigm Community Edition or
 * UMLet, but they are more complicated to use.
 * 
 * 1. Design a class named Rectangle to represent a rectangle. The class
 * contains:
 * 
 * - Two double data fields named width and height that specify the width and
 * height of the rectangle. The default values are 1 for both width and height.
 * 
 * - A string data field named color that specifies the color of a rectangle.
 * Hypothetically, assume that all rectangles have the same color. The default
 * color is white.
 * 
 * - A no-arg constructor that creates a default rectangle.
 * 
 * - A constructor that creates a rectangle with the specified width and height.
 * 
 * - The accessor and mutator methods for all three data fields.
 * 
 * - A method named getArea() that returns the area of this rectangle.
 * 
 * - A method named getPerimeter() that returns the perimeter.
 * 
 * Draw the UML diagram for the class using one of the UML tools above.
 * Implement the class. Write a test program that creates two Rectangle objects.
 * Assign width 4 and height 40 to the first object and width 3.5 and height
 * 35.9 to the second object. Assign color red to all Rectangle objects. Display
 * the properties of both objects and find their areas and perimeters.
 **/

public class Rectangle {
    private double width;
    private double height;
    String color;

    public Rectangle() {
        width = 1;
        height = 1;
        color = "white";
    }

    public Rectangle(double rectangleWidth, double rectangleHeight, String rectangleColor) {
        width = rectangleWidth;
        height = rectangleHeight;
        color = rectangleColor;
    }

    public void setWidth(double setWidthValue) {
        width = setWidthValue;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double setHeightValue) {
        height = setHeightValue;
    }

    public double getHeight() {
        return height;
    }

    public void setColor(String setColorValue) {
        color = setColorValue;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        double areaFormula = (width * height) / 2;
        return areaFormula;
    }

    public double getPerimeter() {
        double perimeterFormula = (width * 2) + (height * 2);
        return perimeterFormula;
    }
    public void displayRectangle() { 
        System.out.println(getHeight());
        System.out.println(getWidth());
        System.out.println(getColor());
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
