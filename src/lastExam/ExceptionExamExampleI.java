package lastExam;


public class ExceptionExamExampleI {

    public static void main (String[] args) {
      int num1 = 1 , num2 = 1, result = 0;
      if (args.length != 3) {
  System.out.println("Please use: java Calculator num1 op num2");
       System.exit(0);
      }
      // Try 1
  try {
        num1 = Integer.parseInt(args[0]);
      }catch (NumberFormatException ex) {
        System.out.println("Wrong Input: " + args[0]);
        System.exit(0);
      }
    //  Try 2
  try {
        num2 = Integer.parseInt(args[2]);
      }catch (NumberFormatException ex) {
        System.out.println("Wrong Input: " + args[2]);
        System.exit(0);
      }
      // Try 3
      switch (args[1].charAt(0)) {
        case '+': result = num1 + num2;
                  break;
        case '-': result = num1 - num2;
                  break;
        case '*': result = num1 * num2;
                  break;
        case '/': try {
                  result = num1 / num2;
                  } catch (Exception ex) {
                  System.out.println("Division by zero is illegal");
                  System.exit(0);
        }
    }
    System.out.println(result);
}
}