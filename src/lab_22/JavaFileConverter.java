package lab_22;


import java.io.*;
import java.util.Scanner;

public class JavaFileConverter {
    public static void main(String [] args) {
        File foo = new File("Test.java");
        try {
            Scanner input = new Scanner(foo);
            String [] arr = new String[8];
            int i = 0;while(input.hasNext()) {
                String line = input.nextLine();
                arr[i] = line;i++;
            } for(i = 0; i< arr.length; i++) {
                if(arr[i].equals("{")) {
                    arr[i-1] += arr[i];
                }
            }
            FileWriter fw = new FileWriter(foo);
            PrintWriter pw = new PrintWriter(fw);
            for(i =0; i< arr.length; i++) {
                if(arr[i].equals("{")) {
                    continue;
                } 
                pw.println(arr[i]);
                pw.flush();
            }
        } catch(IOException e) {            
        }
    }
}``
