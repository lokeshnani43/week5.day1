package week5.day1;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Lokesh");
	}

public void studentDept() {
		
		System.out.println("EEE");
	}

public void studentID() {
	
	System.out.println(130429l);
}

public static void main(String[] args) {
	
	Student obj = new Student();

	System.out.println("Lokesh College Details");
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.deptName();
	obj.studentName();
	obj.studentDept();
	obj.studentID();
	
}

}
