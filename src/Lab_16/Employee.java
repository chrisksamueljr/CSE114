package Lab_16;

public class Employee extends Person {
    private int salary;
    private MyDate date;

    public MyDate getMyDate() {
        return date;
    }

    public Employee(String n, String a, String p, int a2, String e, int s2, MyDate d) {
        super(n, a, p, a2, e);
        salary = s2;
        date = d;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nDate: " + date.getYear() + "-" + date.getMonth() + "-"
                + date.getDay();
    }
}