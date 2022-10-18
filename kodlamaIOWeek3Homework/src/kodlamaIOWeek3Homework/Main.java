package kodlamaIOWeek3Homework;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWeek3Homework.business.CategoryManager;
import kodlamaIOWeek3Homework.business.CourseManager;
import kodlamaIOWeek3Homework.business.InstructorManager;
import kodlamaIOWeek3Homework.core.logging.DatabaseLogger;
import kodlamaIOWeek3Homework.core.logging.FileLogger;
import kodlamaIOWeek3Homework.core.logging.Logger;
import kodlamaIOWeek3Homework.dataAccess.JDBC.JdbcCategoryDao;
import kodlamaIOWeek3Homework.dataAccess.JDBC.JdbcCourseDao;
import kodlamaIOWeek3Homework.dataAccess.JDBC.JdbcInstructorDao;
import kodlamaIOWeek3Homework.entities.Category;
import kodlamaIOWeek3Homework.entities.Course;
import kodlamaIOWeek3Homework.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };

		List<Course> courseDb = new ArrayList<>();
		List<Category> categoryDb = new ArrayList<>();

		//////////////////////////////////////
		Category category = new Category(1, 1, "Programlama");
		Category category2 = new Category(2, 2, "Sistem");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryDb);
		categoryManager.CategoryAdd(category);
		categoryManager.CategoryAdd(category2);

		//////////////////////////////////////

		Course course = new Course(1, 1, "JAVA", 1200);
		Course course2 = new Course(2, 2, "C#", 2400);
		Course course3 = new Course(2, 3, "JavaScript", 3600);
		Course course4 = new Course(4, 4, "Java+React", 4800);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.CourseAdd(course);
		courseManager.CourseAdd(course2);
		courseManager.CourseAdd(course3);
		courseManager.CourseAdd(course4);

		//////////////////////////////////////

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.InstructorAdd(instructor);

	}

}
