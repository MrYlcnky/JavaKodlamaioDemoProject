package JavaKodlamaioDemoProject.dataAccess;

import JavaKodlamaioDemoProject.entities.Category;
import JavaKodlamaioDemoProject.entities.Course;
import JavaKodlamaioDemoProject.entities.Instructor;

public class HibernateDao implements CategoryDao,CourseDao,InstructorDao{
	
	public void addCategory(Category category) {
		System.out.println("Hibernate ile category veritabanına eklendi "+category.getCategoryName());
	}
	public void deleteCategory(Category category) {
		System.out.println("Hibernate ile category veritabanından silindi "+category.getCategoryName());
	}
	
	public void addCourse(Course course) {
		System.out.println("Hibernate ile course veritabanına eklendi "+course.getCourseName());
	}
	public void deleteCourse(Course course) {
		System.out.println("Hibernate ile course veritabanından silindi "+course.getCourseName());
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Hibernate ile instructor veritabanına eklendi "+instructor.getInstructorName()+instructor.getInstructorLastName());
	}
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Hibernate ile instructor veritabanından silindi "+instructor.getInstructorName()+instructor.getInstructorLastName());
	}
	

}
