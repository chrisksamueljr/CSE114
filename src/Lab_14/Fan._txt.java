// FAN CLASS 

public class Fan {
    private final int mode0 = 1;
    private final int mode1 = 2;
    private final int mode2 = 3;
    private int speed;
    private boolean io_Switch;
    private double radius;
    private String color;

    public Fan() {
        speed = mode0;
        io_Switch = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(String s) {
        if (s.equals("mode0"))
            speed = mode0;
        if (s.equals("mode1"))
            speed = mode1;
        if (s.equals("mode2"))
            speed = mode2;
    }

    public boolean getio_Switch() {
        return io_Switch;
    }

    public void setio_Switch(boolean o) {
        io_Switch = o;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public String toString() {
        return "Speed: " + speed + "\nStatus: " + io_Switch + "\nRadius: " + radius + "\nColor: " + color;
    }
}

public class FanTester {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.setSpeed("mode0");
        f.setColor("red");
        System.out.println(f.toString());
    }
}