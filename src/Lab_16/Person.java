package Lab_16;

public class Person {
    private String name;
    private String address;
    private String phoneNum;
    private int age;
    private String email;

    public Person(String name, String address, String phoneNumber, int age, String email) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNumber;
        this.age = age;
        this.email = email; 
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNum + "\nAge:" + age + "\nEmail: "
                + email;
    }
}