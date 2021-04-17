package Lab_06;

import java.util.Scanner;

public class CentralProcessingUnitCalculuator {
	public static void main(String [] args) {
		boolean isInvalid = false;
		double disk_size = 0.0;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the CentralProcessingUnit: ");
		String CentralProcessingUnit = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Enter the disk type: ");
		String diskType = scan.nextLine();

		System.out.print("Enter the ghz: ");
		double ghz = scan.nextDouble();
		
		System.out.println(ghz);
	
	
		System.out.println("Enter the disk size: ");
		double gigs = scan.nextDouble();
		
		// int correct = 1;
		double main_price = 1000;
		



		// System.out.println("Enter the disk size: "+ CentralProcessingUnit);
		// System.out.println("Enter the disk size: "+ diskType);
		// System.out.println("Enter the disk size: "+ gigs);
		// System.out.println("Enter the disk size: "+ ghz);
		
		
		//Central Processing Unit IF Statement
		
		main_price = addComputingProcessingUnitPrice(CentralProcessingUnit,main_price, isInvalid);
		

		// Initiate a price check for boolean
		double priceCheck = main_price;
		main_price = addProcessingSpeedPurchase(main_price, ghz);
		isInvalid = isCPUInvalid(isInvalid,main_price,priceCheck);
		// // GHZ IF Statement
	
		
		
		// // DISK TYPE IF STATEMENT
	    priceCheck = main_price;
		main_price = addDiskTypePrice(main_price, diskType);
		isInvalid = isCPUInvalid(isInvalid,main_price,priceCheck);

		// Disk Space Statement	
		main_price = addCostForDiskSize(main_price, gigs);
		
		
		System.out.println(total_Computing_Price(main_price, flagIfInvalid(isInvalid,main_price)));

	// }
		
	
	}
		private static double addProcessingSpeedPurchase(double price, double cycleSpeed) {
			double currentPrice = price;
			double processing_speed = cycleSpeed;
		
			boolean greater_than_or_equal_to_2 = (processing_speed >= 2);
			boolean processing_speed_between_1_and_2 = ((processing_speed >= 1) && (processing_speed < 2));
				if(greater_than_or_equal_to_2) {
					price = price + 150;
				} else if(processing_speed_between_1_and_2) {
					price = price + 80;
			 	}
				return price;
		}

		private static boolean isCPUInvalid (boolean isInvalid, double currentPrice, double afterSpeedPrice) {
				boolean is_invalid = isInvalid;
				double price = currentPrice;
				double price_before_Speed_price = afterSpeedPrice;
				if(price ==price_before_Speed_price) {
					return 	is_invalid = true;
				} else {
					return false;
				}
				
		}
		private static double addDiskTypePrice(double price, String diskType) {
			double currentPrice = price;
			String storageType = diskType;
						if(diskType.equals("SSD")) {
							currentPrice = currentPrice + 225;
						} else if(diskType.equals("HDD")) {
							currentPrice = currentPrice + 100;
						}
						return currentPrice;
		}	
		private static double addComputingProcessingUnitPrice(String chip, double amount, boolean isInvalid) {
			String cpu = chip;
			double price = amount;
			boolean is_invalid = isInvalid;
			if(cpu.equals("Intel")) {
				price = price + 200;
			} else if(cpu.equals("AMD")) {
				price = price + 175;
			} else {
				is_invalid = true;
			}
			return price;
		}
		private static double addCostForDiskSize(double amount, double gigabytes) {
			double price = amount;
			double gigs = gigabytes;
			double twoTimesDiskSpace = (gigs*2);
			return (price + twoTimesDiskSpace);
}	
		private static float flagIfInvalid(boolean isInvalid, double totalPrice) {
			boolean is_invalid = isInvalid;
			double price = totalPrice;
			double INVALID_COMPUTING_DEVICE = (float) -1.0;
		    double VALID_COMPUTING_DEVICE = (float) 0;
			if(is_invalid = true) { 
				return (float)INVALID_COMPUTING_DEVICE;
			} else {
				return  (float)VALID_COMPUTING_DEVICE;
			} 
		}
		public static double total_Computing_Price(double price, double value)  {
			double IS_INVALID = value;
			double total_price = price; 
			if(IS_INVALID == -1.0) {
				return IS_INVALID;
			} else {
				return total_price; 
			}

		}

}
