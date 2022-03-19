package week5.day1;

public class Jobseeker extends Person {
	
	 public void workingProfessional() {


		 System.out.println("I am a Tester");
	}
	 
	 public void attitude(String name) {


			System.out.println(name +"Positive minded");
			
	 }

	 public static void main(String[] args) {
		
		 Jobseeker call = new Jobseeker();
		 call.personState();
		 call.workingProfessional();
		 call.attitude("Lokesh");

	 }
}
