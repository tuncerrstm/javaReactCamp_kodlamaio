package homeWork;

public class Course {
	
	public Course() {}
	
	public Course(int id,int categoryId,int instructorId,String name) {
		this();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.instructorId = instructorId;
		
	}
	
	
	int id;
	int categoryId;
	int instructorId;
	String name;

}
