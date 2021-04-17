package Lab_05;


import java.util.*;
public class fulltimeOrPartime {

	public static void main(String [] args) {
		
		ArrayList<String> codeMessageList = getCodeMessages();
		
		String welcomeMessage = "Please confirm whether you are full time or Part time.\n";
		String loadingScreen = "Loading";
		String loadingDots = ".....\n";
		String enterCreditPrompt = "Enter the Student\'s number of credits (Greater than 0)";
		String checkingSchoolCriteria = "Checking School Servers ";
		typingEffect(welcomeMessage, 10);
		typingEffect(loadingScreen, 10);
		typingEffect(loadingDots, 500);
		typingEffect(enterCreditPrompt, 10);
		
		Scanner scan = new Scanner(System.in);
		int studentCredits = scan.nextInt();
		int codeAnalyzer = isFullTimer(studentCredits);	
		typingEffect(checkingSchoolCriteria, 10);
		typingEffect(loadingDots, 500);
		System.out.println(codeMessageList.get(codeAnalyzer));
		scan.close();
	}
	public static void typingEffect(String text, int speed) {
		
		int i;
		for(i = 0; i < text.length(); i++){
		    System.out.printf("%c", text.charAt(i));
		    try{
		        Thread.sleep(speed);//0.5s pause between characters
		    }catch(InterruptedException ex){
		        Thread.currentThread().interrupt();
		    }
		}
		
	}
	
public static int isFullTimer(int credits) {
	int numberOfCredits = credits; 
	int code = 0;
	if (numberOfCredits < 1) {
		code = 0;
		
	} else if(numberOfCredits >= 1 && numberOfCredits < 12) {
		// part time
		code = 1;
	} else if(numberOfCredits >= 12) {
		// full time (Anything Greater or equal to 12)
		code = 2;
	}
	return code;
}	

public static ArrayList<String> getCodeMessages() {
	
	ArrayList<String> basicStringList = new ArrayList<>();
	basicStringList.add("Invalid Credits Try Again.");
	basicStringList.add("Student is Part Time");
	basicStringList.add("Student is Full TIme");
	
	return basicStringList;
	
} 
}
