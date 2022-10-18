package kodlamaIOWeek3Homework.entities;

public class Course {

	private int courseID;
	private int instructorID;
	private String courseName;
	private int unitPrice;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int courseID, int instructorID, String courseName, int unitPrice) {
		this.courseID = courseID;
		this.instructorID = instructorID;
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public int getInstructorID() {
		return instructorID;
	}

	public void setInstructorID(int instructorID) {
		this.instructorID = instructorID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
