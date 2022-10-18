package kodlamaIOWeek3Homework.dataAccess.JDBC;

import kodlamaIOWeek3Homework.dataAccess.Interface.InstructorDao;
import kodlamaIOWeek3Homework.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	public void instructorAdd(Instructor instructor) {

		System.out.println("JDBC olarak Veri tabanına eğitimci eklendi.");
	}
}
