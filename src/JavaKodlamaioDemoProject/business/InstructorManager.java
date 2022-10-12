package JavaKodlamaioDemoProject.business;

import java.util.ArrayList;
import java.util.List;

import JavaKodlamaioDemoProject.core.logging.Logger;
import JavaKodlamaioDemoProject.dataAccess.CourseDao;
import JavaKodlamaioDemoProject.dataAccess.InstructorDao;
import JavaKodlamaioDemoProject.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructorDao;
	private Logger[] loggers;

	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	//İş Kuralları: Aynı Eğitmen Olamaz
	
	List<Instructor> instructors=new ArrayList<>();
	
	public void addInstructor(Instructor instructor) throws Exception {
		
		for (Instructor instructors : instructors) {
			if (instructors.getInstructorName().toLowerCase().equals(instructor.getInstructorName().toLowerCase())==true && 
					(instructors.getInstructorLastName().toLowerCase().equals(instructor.getInstructorLastName().toLowerCase()))==true) {
				
				throw new Exception("Bu eğitmen Var!!!");
				
			}
		}
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructorName());
			logger.log(instructor.getInstructorLastName());
		}
	}
	
	public void deleteInstructor(Instructor instructor) throws Exception {
		
		for (Instructor instructors : instructors) {
			if (instructors.getInstructorName().toLowerCase().equals(instructor.getInstructorName().toLowerCase())==false && 
					(instructors.getInstructorLastName().toLowerCase().equals(instructor.getInstructorLastName().toLowerCase()))==false) {
				
				throw new Exception("Böyle bir eğitmen Yok!!!");
				
			}
		}
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructorName());
			logger.log(instructor.getInstructorLastName());
		}
	}
}
