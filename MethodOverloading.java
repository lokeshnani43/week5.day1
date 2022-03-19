package week5.day1;

public class MethodOverloading {
	
	public void studentInfo(String name, int rollno) {
		
		System.out.println(name + " " +rollno);
	}
	
	public void studentInfo(String colName, String Location) {
		
		System.out.println(colName + " " +Location);
	}
	
public void studentInfo(long phno) {
		
		System.out.println(phno);
	}

public void studentInfo() {
	
	System.out.println("Example of Method Overloading");
}

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.studentInfo();
		obj.studentInfo("Lokesh", 9);
		obj.studentInfo(9491976577l);
		obj.studentInfo("SKU", "ATP");
	}

}
