package kodlamaIOWeek3Homework.dataAccess.JDBC;

import kodlamaIOWeek3Homework.dataAccess.Interface.CourseDao;
import kodlamaIOWeek3Homework.entities.Course;

public class JdbcCourseDao implements CourseDao {

	public void courseAdd(Course course) {

		System.out.println("JDBC olarak Veri tabanına kurs eklendi.");
	}
}
