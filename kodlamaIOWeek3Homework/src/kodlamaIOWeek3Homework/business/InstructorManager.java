package kodlamaIOWeek3Homework.business;

import kodlamaIOWeek3Homework.core.logging.Logger;
import kodlamaIOWeek3Homework.dataAccess.Interface.InstructorDao;
import kodlamaIOWeek3Homework.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;

	}

	public void InstructorAdd(Instructor instructor) {
		System.out.println("Eğitmen Adı : " + instructor.getInstructorFirstName()+ " " + instructor.getInstructorLastName() );
		instructorDao.instructorAdd(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorFirstName());
		}
	}

}
