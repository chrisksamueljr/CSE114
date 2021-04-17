package Lab_05;

import java.util.*;

public class QuizProgram {
	
		public static void main(String [] args) {


			String message = "You are not a Fan of Magic The Gathering!!";
			String instructions = "You must answer ten (10) questions get 9 out of time to be considered a fan!!\n"; 
			typingEffect(message, 50);
			System.out.println();
			System.out.println();
			System.out.println();
			typingEffect(instructions, 50);
			
			ArrayList<String> questionMessageLists = addQuestions();
			System.out.println();
			
			Scanner scan = new Scanner(System.in);
			System.out.println(questionMessageLists.get(4));
			
		
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
		
		public static ArrayList<Integer> getQuestions() {
			
			ArrayList<Integer> basicStringList = new ArrayList<>();
			
			
			return basicStringList;
		}
		
	public static ArrayList<String> addQuestions() {
		ArrayList<String> basicQList = new ArrayList<>();
			basicQList.add("How many colors are available to play in the Magic The Gathering \n\n A) Four \n B) Five \n C) Six \n D) Seven");
			basicQList.add("Who was the original creator of magic the gathering \n\n A) Jim Davis  \n B) Leroy Jenkins \n C) Richard Garfield \n D) Martha Stewart");
			basicQList.add("How many cards does your opponent need to have in order for\n you to win without bringing their life to zero?\n\n \n A) 69 \n B) 14 \n C) 0 \n D) 7");
			basicQList.add("When you play cards from the AZORIUS Tribe which colors are you referring to? \n\n A) Blue/Green  \\n B) Red/Black \\n C) Blue/White \\n D) Red/White ");
			basicQList.add("Question");
			basicQList.add("Question");
			basicQList.add("Question");
			basicQList.add("Question");
			basicQList.add("Question");
			basicQList.add("Question");
			
			return basicQList;
		}
		
		
}
