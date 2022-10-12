package JavaKodlamaioDemoProject;

import JavaKodlamaioDemoProject.business.CategoryManager;
import JavaKodlamaioDemoProject.business.CourseManager;
import JavaKodlamaioDemoProject.business.InstructorManager;
import JavaKodlamaioDemoProject.core.logging.DatabaseLogger;
import JavaKodlamaioDemoProject.core.logging.FileLogger;
import JavaKodlamaioDemoProject.core.logging.Logger;
import JavaKodlamaioDemoProject.core.logging.MailLogger;
import JavaKodlamaioDemoProject.dataAccess.HibernateDao;
import JavaKodlamaioDemoProject.dataAccess.JdbcDao;
import JavaKodlamaioDemoProject.entities.Category;
import JavaKodlamaioDemoProject.entities.Course;
import JavaKodlamaioDemoProject.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		
		//Course
		Course course=new Course("Java",1,10);
		Course course2=new Course("Python", 2, 20);
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		CourseManager courseManager= new CourseManager(new JdbcDao(), loggers);
		
		courseManager.addCourse(course);
		courseManager.addCourse(course2);

		
	
		//Category
		Category category=new Category("Web Programming");
		Category category1=new Category("Frontend");
		
		CategoryManager categoryManager=new CategoryManager(new HibernateDao(), loggers);
		
		categoryManager.addCategory(category);
		categoryManager.addCategory(category1);
		
		//Instructor
		Instructor instructor=new Instructor("Mehmet", "Yalcinkaya", 1);
		Instructor instructor2=new Instructor("Ahmet", "Deniz", 2);
		
		InstructorManager instructorManager=new InstructorManager(new JdbcDao(), loggers);
		
		Instructor instructor3= new Instructor("Ali", "Balcı", 3);
		
		instructorManager.addInstructor(instructor);
		instructorManager.addInstructor(instructor2);
		instructorManager.deleteInstructor(instructor3);
		
	}

}
