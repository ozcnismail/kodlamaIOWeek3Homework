package kodlamaIOWeek3Homework.entities;

public class Category {

	private int categoryID;
	private int courseID;
	private String categoryName;
	
	
	public Category(int categoryID, int courseID, String categoryName) {

		this.categoryID = categoryID;
		this.courseID = courseID;
		this.categoryName = categoryName;
	}


	public int getCategoryID() {
		return categoryID;
	}


	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}


	public int getCourseID() {
		return courseID;
	}


	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	 
	
	
}
