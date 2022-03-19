package week5.day1;

public class AxisBank extends BankInfo{

	
	public void depoist() {
		
		System.out.println("Depoist 100000 Amount in Bank Account");
	}
	public static void main(String[] args) {


		
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.depoist();
	}

}
