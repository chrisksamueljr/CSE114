package Lab_14;

public class Fan {
    
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    
    
    private int speed;
    private boolean onOrOff;

    private double radius;
    private String color;


    // create the Fan constructor
    public Fan() {
        speed = SLOW;
        onOrOff = false;
        radius = 5;
        color = "blue";

    }

    // create our fan methods (verbs)
    public void getSpeed(int s) {
        speed = s;
    }

    public boolean getOnOrOff()  {
        return onOrOff;

    }

    public void setOnOrOff(boolean o) {
        onOrOff = o;
    }

    public double getRadius() {
        return radius;
    }
    
    public void setSpeed(String s) {
        if (s.equals("SLOW"))
            speed = SLOW;
        if (s.equals("MEDIUM"))
            speed = MEDIUM;
        if (s.equals("FAST"))
            speed = FAST;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color= c;
    }

    public String toString() {
         return "Speed: " + speed + "\nStatus: " + onOrOff + "\n" + "\nRadius: " + radius + "\n" +  "\nColor: " + color + "\n";
    }
}
