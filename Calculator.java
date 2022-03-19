package week5.day1;

public class Calculator {
	
public void add(int x, int y) {
		
	System.out.println(x+y);
	
	}

public void add(float z, float w) {
	
	System.out.println(z+w);
	
	}

public void add(long a, long b) {
	
	System.out.println(a+b);
	
	}

public void add(short c, long d) {
	
	System.out.println(c+d);
	
	}

	public static void main(String[] args) {


		System.out.println("Calculator");
		Calculator obj = new Calculator();
		obj.add(9, 3);
		obj.add(72.5f, 42.5f);
		obj.add(998599l, 1589875l);
		obj.add(52, 62);
		
		
	}

}
