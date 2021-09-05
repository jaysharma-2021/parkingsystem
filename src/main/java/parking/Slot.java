package parking;

import java.util.HashMap;
import java.util.Map;

public class Slot {

	int slotNumber;
	
	static HashMap<Integer,Car> objCarli = new HashMap<Integer,Car>();
	
	Slot(int slotNumber){
		
		this.slotNumber = slotNumber;
	}
	
	public int getSlotNumber() {
		return slotNumber;
	}
	
	public int parkingEntry(String carNumber, String carColor) {
		int slots=nextSlotAvailable();
		Car objCar = new Car(carNumber, carColor, slots);
		objCarli.put(slots, objCar);
		return slots;
	}
	
	public int nextSlotAvailable() {
		
		int nextSlotNumber = 0;
		System.out.println("cars in parking "+objCarli.size() );
		for(int i=1; i <=slotNumber; i++) {
			if(objCarli.get(i) == null)
			{
				System.out.println("slot availabe "+i);
				return i;
			}
		}
		return nextSlotNumber;
	}
	
	HashMap<Integer, Car> removeSlot(int removeSlot){
		objCarli.remove(removeSlot);
		return objCarli;
	}
	
	public void listOfcarDetails() {
		for(Map.Entry<Integer, Car> entry : objCarli.entrySet()) {
			System.out.println("Slot number: " + entry.getValue().getSlotNumber());
			System.out.println("Car number: " + entry.getValue().getRegistrationNumber());
			System.out.println("Color: " + entry.getValue().getColor());
		}
	}
	
	public void listofcarColorDetails(String carColor) {
		boolean carcolorexist = false;
		for(Map.Entry<Integer, Car> entry : objCarli.entrySet()) {
			if(entry.getValue().getColor().equalsIgnoreCase(carColor))
			{
				System.out.println("slot number: " + entry.getValue().getSlotNumber());
				carcolorexist= true;
			}
		}
		if(!carcolorexist) {
			System.out.println("No car is found with given color");
		}
	}
	
	public void listofcarRegistrationNumber(String carNumber)
	{
		boolean carNumberexist = false;
		for(Map.Entry<Integer, Car> entry : objCarli.entrySet()) {
			if(entry.getValue().getRegistrationNumber().equalsIgnoreCase(carNumber)) {
				System.out.println("slot number: " + entry.getValue().getSlotNumber());
				carNumberexist = true;
			}
		}
		if(!carNumberexist) {
			System.out.println("No car is found with given Car Number");
		}
	}

}
