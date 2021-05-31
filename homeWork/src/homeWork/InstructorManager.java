package homeWork;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Instructor added " + instructor.firstname + instructor.lastname  );
	}
	public void delete(Instructor instructor) {
		System.out.println("Instructor deleted " + instructor.firstname + instructor.lastname );
	}

}
