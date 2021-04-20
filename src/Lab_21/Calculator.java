package Lab_21;

public class Calculator { 
    public static void main(String [] args) {
        int one = Integer.parseInt(args[0]);
        String operator = args[1];
        System.out.println(args);
        int two = Integer.parseInt(args[2]);
        
        if(operator == ("*")) {
            System.out.println(one*two);
        
        } else if(operator == ("-")) {
            System.out.println(one-two);
        
        } else if(operator == ("*")) {
            System.out.println(one*two);
        
        } else if (operator == ("/")) {
            try {
                System.out.println(one/two);
            } catch(ArithmeticException e) {
                System

                    .out.println("Can't divide by zero");
            }
        }
    }
}
