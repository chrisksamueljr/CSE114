
package Lab_16;

public class Student extends Person {
    private final String FRESHMAN = "Freshman";
    private final String SOPHMORE = "Sophmore";
    private final String JUNIOR = "Junior";
    private final String SENIOR = "Senior";
    private String status;

    public Student(String n, String a, String p, int a2, String e, String s) {
        super(n, a, p, a2, e);
        if (s == "Freshman")
            status = FRESHMAN;
        if (s == "Sophmore")
            status = SOPHMORE;
        if (s == "Junior")
            status = JUNIOR;
        if (s == "Senior")
            status = SENIOR;
    }

    public String toString() {
        return super.toString() + "\nStatus: " + status;
    }
}

