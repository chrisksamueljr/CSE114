package temperatureReader;

import java.util.Scanner;

public class DashboardStatus {
	public String welcomeMessage = "Enter a degree in Celsius:  ";
	protected double celsiusTemperature;
	protected double fahrenheitTemperature;
	private String statusMessage ;

	
	public DashboardStatus()
	{
		System.out.println( "Parent Constructor with no parameters" );
	}
	
	public DashboardStatus(String parentWelcomeMessage, 
						   int parentCelsiusTemperature,
						   int parentFahrenheitTemperature,
						   String parentStatusMessage
						   )
	{
		System.out.println(" Parent Constructor with 3 parameters ");
		
		// Assigns it to the 4 private fields  in the DashboardStatus class
		welcomeMessage = parentWelcomeMessage;
		celsiusTemperature = parentCelsiusTemperature;
		fahrenheitTemperature = parentFahrenheitTemperature;
		
		// comment this out for now.
		//		statusMessage =parentStatusMessage;
	
	}
	
	
	// The getter method simply returns the value of the discount field;
		public double getTemperatureInCelsius() {
			return 	celsiusTemperature;
		}
		
		public void setDiscount() {
			Scanner scan = new Scanner(System.in);
//			String password; 
			System.out.print(" Please enter the admin password:  ");
//			password = scan .nextLine();
		}
		public void displayStatus() { 
			System.out.println(celsiusTemperature  +" in Celsius is "+ fahrenheitTemperature +" in Fahrenheit"); 
		
		
		}
}
