package Lab_04;
import java.util.*;
import java.time.*;
import java.time.format.TextStyle;

/**
 * 
 * (Hard) Read a date in the format MM/DD/YYYY and print it out as Month DD,
 *  Year. For example, we read 02/07/2019 and print February 7, 2019.
 *  Optional, print the day: Thursday, February 7, 2019.
 * */
public class printExpandedDate {
	public static void main(String [] args) {
		
		LocalDate localDate = LocalDate.parse("2018-08-29");
		
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		
		String displayName = dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
	
	      // Instantiate a Date object
	      Date date = new Date();
	      String formattedDate = myDateObj.format(myFormatObj); 
	      // display formatted date
	      System.out.printf("%s %tB %<te, %<tY", displayName , formattedDate);
	   
//		System.out.println(localDate);
	}

}
