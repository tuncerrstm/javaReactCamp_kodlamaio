package homeWork;

public class Main {

	public static void main(String[] args) {
		
		CategoryManager categoryManager = new CategoryManager();
		InstructorManager instructorManager = new InstructorManager();
		CourseManager courseManager = new CourseManager();
		
		Category catyegory1 = new Category(1,"Programlama");
		Instructor instructor1 = new Instructor(1,"Engin ","Demiroğ");
		
		
		Course course1 = new Course(1,1,1,"C#");
		Course course2 = new Course(2,1,1,"Java");
		
		Course[]courses = {course1,course2};
		
		
	for (Course course : courses) {
		System.out.println(course.name);
	}
	
	categoryManager.add(catyegory1);
	instructorManager.add(instructor1);
	
	courseManager.add(course1);
	courseManager.delete(course2);
	

	}

}