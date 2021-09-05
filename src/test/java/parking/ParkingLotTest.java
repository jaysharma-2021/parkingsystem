package parking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




class ParkingLotTest {

	@Test
	void checkCarParkingEntry() {
		Slot objslot = new Slot(10);
		int SlotNumber = objslot.parkingEntry("Ts100", "red");
		assertEquals(1,SlotNumber);
	}
	
	@Test
	void testWithCarColor() {
		Car car = new Car("Ts100","red",1);
		assertEquals("red",car.getColor());
	}
	


}
