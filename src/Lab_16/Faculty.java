package Lab_16;

public class Faculty extends Employee {
    private String officeHours;
    private int rank;

    public Faculty(String n, String a, String p, int a2, String e, int s2, MyDate d, String o, int r) {
        super(n, a, p, a2, e, s2, d);
        officeHours = o;
        rank = r;
    }

    public int salaryRange(int rank) {
        if (rank * getMyDate().getYear() < 10)
            return 1;
        else if (rank * getMyDate().getYear() < 20 && rank * getMyDate().getYear() >= 10)
            return 2;
        else if (rank * getMyDate().getYear() <= 20)
            return 3;
        return 0;
    }

    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}