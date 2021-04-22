package lab_22;


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;


public class InputOutput {
    public static void main(String [] args) {
        File foo = new File("input");
        try {
            Scanner input = new Scanner(foo);
            String line = "";
            String [] holder = new String [3];
            int i = 0;
            while(input.hasNext()) {
                line = input.nextLine();
                System.out.println(line);
                line = line.replace("Java", "HTML");
                holder[i]=line;
                System.out.println(holder[i]);
                i++;
            } FileWriter fw = new FileWriter(foo);
            PrintWriter replace = new PrintWriter(fw);
            for(i = 0; i< 3; i++) {
                replace.println(
                        holder[i]);replace.flush();
            }
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
}
