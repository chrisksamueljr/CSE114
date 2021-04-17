package Lab_05;
import org.json.*;
import java.util.Scanner;
public class Question {
    public String welcome = "Welcome to ABC Fitness";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;
   
    public Question()
    {
        System.out.println("Parent Constructor with no parameter");        
    }        

    public Question(String p_questionString,
                    String p_choice_A, 
                    String p_choice_B,
                    String p_choice_C,
                    String p_choice_D,
                    String p_choice_E
                    String p_answer;
                    Int p_questionCode;
                    )
    {
	System.out.println("Parent Constructor with 6 parameters");


// String p_questionString,
//                     String p_choice_A, 
//                     String p_choice_B,
//                     String p_choice_C,
//                     String p_choice_D,
//                     String p_choice_E
                    
	question = p_questionString;
	choice_A = p_choice_A;
    choice_B = p_choice_B;
    choice_C = p_choice_C;
    choice_D = p_choice_D;
    choice_E = p_choice_E;
    answer   = p_answer; 
    completed = p_questionCode;
    }

    public boolean checkSelection(String answer, String userSelection) {
        if(answer == userSelection){
            return true;
        } else {
            false;
        }
    }

    public int completeQuestion(int code) {
        System.out.println(" Question Completed! ");
        if(code != 0) {
            return 1;
        }
    }
    
    public void displayMemInfo(){

	System.out.println("Member Name: " + name);
	System.out.println("Member ID: " + memberID);
	System.out.println("Member Since " + memberSince);
	System.out.println("Annual Fee: " + annualFee);
    }

    public void calculateAnnualFee()
    {
        annualFee = 0;
    }
    
    //abstract public void calculateAnnualFee();
    
}
