package week5.day1;

public class Sports {
	
public void Acheiver(String name, int medalcount) {
		
		System.out.println(name + " " +medalcount);
	}
	
	public void Acheiver(String country, String sportname, int rank) {
		
		System.out.println(country + " " +sportname + " " +rank);
	}
	
public void Acheiver(float weight, int height, long ContactNo) {
		
	System.out.println(weight + " " +height + " " +ContactNo);
	}

public void Acheiver(String tournamentName, long prizeMoney) {
	
	System.out.println(tournamentName + " " +prizeMoney);
	}

	public static void main(String[] args) {

		Sports obj = new Sports();
		
		obj.Acheiver("Yuvaraj", 2);
		obj.Acheiver("India", "Cricket", 1);
		obj.Acheiver(75.8f, 6, 9491976577l);
		obj.Acheiver("IPL", 500000l);
		

	}

}
