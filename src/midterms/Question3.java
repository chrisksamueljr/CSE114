package midterms;

public class Question3 {
    public static void main(String[] args) {
        int i = 2;
        {
            int j = 3;
            System.out.println("i + j is " + (i + j));
        }
        System.out.println("i + j is " + (i + j));
        System.out.println("j is " +  j);
    }
    static int i = 0;
    static int j = 0;
}