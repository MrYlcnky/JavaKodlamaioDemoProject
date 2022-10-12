package JavaKodlamaioDemoProject.dataAccess;


import JavaKodlamaioDemoProject.entities.Course;

public interface CourseDao {
	void addCourse(Course course);
	
	void deleteCourse(Course course);

}
