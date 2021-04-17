package Lab_14;

public class FanTester {
public static void main(String [] args){
    Fan f = new Fan();
    f.setOnOrOff(true);
    f.setColor("red");
    System.out.println(f.toString());
}
}
