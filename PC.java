package week5.day1;

public class PC extends Laptop{
	
	
	public void getSysteminfo() {
		
		System.out.println("My System model is MAC");
	}

	public static void main(String[] args) {


		PC obj = new PC();
		obj.getSysteminfo();
	}

}
