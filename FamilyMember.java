package week5.day1;

public class FamilyMember extends Jobseeker {
	
	public void father() {


		System.out.println("I am a Father");
	}

	public void attitude(String name) {

		super.attitude(name);
		
		System.out.println(name  +"Self Dependent Person");
		
 }
	public static void main(String[] args) {
		
		FamilyMember mem = new FamilyMember();
		mem.father();
		mem.personState();
		mem.behaviour();
		mem.attitude("Lokesh");
		
		}

	
	}
		

	
