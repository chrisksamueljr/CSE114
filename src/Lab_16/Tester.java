package Lab_16;

public class Tester {
    public static void main(String[] args) {
        MyDate date = new MyDate(2001, 12, 1);
        Student s = new Student("Joe", "100 street", "(111) 111-1111", 19, "joe@gmail.com", "Junior");
        System.out.println(s.toString());
        System.out.println();
        Faculty f = new Faculty("Joe", "100 street", "(111) 111-1111", 19, "joe@gmail.com", 100, date, "1-2PM", 4);
        System.out.println(f.toString());
        System.out.println();
        Staff s1 = new Staff("Joe", "100 street", "(111) 111-1111", 19, "joe@gmail.com", 100, date, "CEO");
        System.out.println(s1.toString());
        System.out.println();
    }
}