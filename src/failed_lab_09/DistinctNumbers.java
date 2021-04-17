
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");

        int input[] = new int[10];
        int num = 0;
        
        for(int index=0; index < 10; index++) {
            num = scan.nextInt();        
            input[index] = num;    
        }
          for(int index=0; index < 10; index++) {
           for(int hint=0; hint < 10; hint++) {
               if(index == hint) {
                   continue;
               } else if(input[index] == input[hint]) {
                   input[index] = -1;
            }
            
        }  
          
        }
  System.out.println("\nThe distinct numbers are: ");
         for(int index=0;index < 10; index++) {
            if(input[index] == -1) 
                 continue;
            System.out.println(input[index]);
               
        }
               
    }
}