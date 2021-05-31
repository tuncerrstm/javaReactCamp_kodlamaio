package homeworkWeek3;

public class Main {

	public static void main(String[] args) {
		
		StudentUser student1= new StudentUser();
		student1.setId(1);
		student1.name = "student name";
		student1.surname = "student last name";
		
		
		InstructorUser teacher1 = new InstructorUser();
		teacher1.setId(0);
		teacher1.name = "teacher name";
		teacher1.surname = "teacher last name";
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCourse("1.Kur");
	}

}
