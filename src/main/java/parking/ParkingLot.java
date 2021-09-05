package parking;

import java.util.Scanner;

public class ParkingLot {
	

	public static void main(String[] args) {
		
		Slot objslot = new Slot(5);
		int menulist;
		
		System.out.println(objslot.getSlotNumber());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.Enter car parking in the slot");
		System.out.println("2.Enter car parking out from the slot");
		System.out.println("3.List of parking cars");
		System.out.println("4.List of slot numbers with the same car color");
		System.out.println("5.Search slot number with the car number");
		System.out.println("6.Exit");
		
		while(true){
			menulist = scan.nextInt();		
			switch(menulist) {
			case 1:
				if(menulist == 1) {
					System.out.println("Enter car number");
					String carNumber = scan.next();
					System.out.println("Enter car color");
					String carColor = scan.next();
					
					int carPark = objslot.parkingEntry(carNumber, carColor);
					if(carPark == 0) {
						System.out.println("slots not available");
					}
					else {
						System.out.println("car parked at the slot "+carPark+"");
					}
				}
				break;
			case 2:	
				System.out.println("Enter slot to remove");
				int removeSlot = scan.nextInt();
				objslot.removeSlot(removeSlot);
				System.out.println("Slot Removed Successfully");
				break;
			case 3:
				System.out.println("List of cars");
				objslot.listOfcarDetails();
				break;
			case 4:
				System.out.println("Enter car color");
				String carColor = scan.next();
				objslot.listofcarColorDetails(carColor);
				break;
			case 5:
				System.out.println("Enter car number");
				String carNumber= scan.next();
				objslot.listofcarRegistrationNumber(carNumber);
				break;
			case 6:
				System.out.println("---------------Exit------------------");
				break;
			default:
				System.out.println("Ivalid option.Please enter again.");
				break;
			}
			
		}
		
	}
}
