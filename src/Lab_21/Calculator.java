package Lab_21;

public class Calculator { 
    public static void main(String [] args) {
        int one = Integer.parseInt(args[0]);
        String operator = args[1];
        int two = Integer.parseInt(args[2]);
        if(operator.equals("+")) {
            System.out.println(one+two);
        } else if(operator.equals("-")) {
            System.out.println(one-two);
        } else if(operator.charAt(0) == '*') {
            System.out.println(two);
            System.out.println(one*two);
        } else if (operator.equals("/")) {
            try {System.out.println(one/two);
                System.out.println("hello");
            } catch(ArithmeticException e) {
                System.out.println("Can't divide by zero");
            }
        }
    }
}
