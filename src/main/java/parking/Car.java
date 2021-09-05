package parking;

public class Car {

	private String carNumber;
	private String carColor;
	private int slotNumber = 0;
	
	public Car(String carNumber, String carColor, int slotNumber) {
		this.carNumber = carNumber;
		this.carColor = carColor;
		this.slotNumber = slotNumber;
	}
	
	public void remove(int slotno) {
		
		this.slotNumber = slotno;
	}
	
	public String getColor() {
		return carColor;
	}
	public void setColor(String color) {
		this.carColor = color;
	}
	
	public String getRegistrationNumber() {
		return carNumber;
	}

	public void setRegistrationNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	
	public int getSlotNumber() {
		return slotNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.slotNumber = slotNumber;
	}
	
	
}
