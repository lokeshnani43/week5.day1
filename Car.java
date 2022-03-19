package week5.day1;

public class Car extends Vehicle {
	
	public void automaticGearsystem() {

		System.out.println("Drive Safely");

	}
	
	public void discBreak() {
		
		System.out.println("Disk Break available");
	}

	public void alloyWheel() {
		
		System.out.println("Moving Car");
		
	}
	
public void electircBike() {
		
		System.out.println("No it is not Electric Bike");
		
}

public void openSunRoof() {
	
	System.out.println("Not a Sunroof");
	
}
	
	public static void main(String[] args) {
		
		Car Breeza = new Car();
		Breeza.applyBrake();
		Breeza.soundHorn();
		Breeza.engine();
		Breeza.automaticGearsystem();
		Breeza.alloyWheel();
		Breeza.discBreak();
		Breeza.electircBike();
		Breeza.openSunRoof();
	}
}
