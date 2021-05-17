package lastExam;
// A Scottish Tartan is a pattern consisting of 
// cross-crossed horizon and vertical colors
// Implement a metho that prints the tartan of the 
// Young McJava Clan. The Method takes a number n 
// as input and prints a matric of n rows and n columuns
//interleaved vertical and horizontal an and n-1 seperated
// with spaces , starting with n.

// examples:
// Tartan(3) prints:
// 3 2 3
// 2 3 2
// 3 2 3

// tartan(4) prints:
// 4 3 4 3
// 3 4 3 4
// 4 3 4 3
// 3 4 3 4 

public class RecursionExample {
    public static void main(String[] args) {
        tartan(3);
        tartan(4);
    }

    public static void tartan(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(((i+j) % 2 == 0 ? n:n-1) + " ");
            }
            System.out.println();
        }
    }
}
