

package Lab_16;

public class Staff extends Employee {
    private String title;

    public Staff(String n, String a, String p, int a2, String e, int s2, MyDate d, String t) {
        super(n, a, p, a2, e, s2, d);
        title = t;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}