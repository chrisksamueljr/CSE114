package lab_22;

import java.io.*;
import java.util.Scanner;


public class NumberFile {
    public static void main(String []args) {
        File foo = new File("test");
        try{Scanner stdin = new Scanner(foo);
            String line = stdin.nextLine();
            String [] numbers = line.split(" ");
            int len = numbers.length;
            int total = 0;
            for(int i = 0 ; i < len ; i++) {
                total += Integer.parseInt(
                        numbers[i]);
            } 
            System.out.println(total);
            System.out.println(total/len);
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
}
