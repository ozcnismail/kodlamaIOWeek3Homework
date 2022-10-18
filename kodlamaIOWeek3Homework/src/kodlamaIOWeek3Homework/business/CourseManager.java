package kodlamaIOWeek3Homework.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIOWeek3Homework.core.logging.Logger;
import kodlamaIOWeek3Homework.dataAccess.Interface.CourseDao;
import kodlamaIOWeek3Homework.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void CourseAdd(Course course) throws Exception {
		if (course.getUnitPrice() <= 0) {
			throw new Exception("Kurs fiyatı 0 TL'den yüksek olmalıdır.");
		}
 
		for (Course courseFor : courses) {
			System.out.println("-----------------");
			if (courseFor.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Aynı isimden kurs bulunmaktadır. Farklı bir kurs ismi seçiniz.");
			}
			System.out.println("-----------------");
		}

		courseDao.courseAdd(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		System.out.println("/////////////////////////");

	}
}
