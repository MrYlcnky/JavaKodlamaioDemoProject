package JavaKodlamaioDemoProject.dataAccess;

import JavaKodlamaioDemoProject.entities.Instructor;

public interface InstructorDao {
	
	void addInstructor(Instructor instructor);
	void deleteInstructor(Instructor instructor);
}
