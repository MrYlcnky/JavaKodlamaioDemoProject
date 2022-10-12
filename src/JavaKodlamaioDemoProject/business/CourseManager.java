package JavaKodlamaioDemoProject.business;

import java.util.ArrayList;
import java.util.List;

import JavaKodlamaioDemoProject.core.logging.Logger;
import JavaKodlamaioDemoProject.dataAccess.CategoryDao;
import JavaKodlamaioDemoProject.dataAccess.CourseDao;
import JavaKodlamaioDemoProject.entities.Course;


public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	
	
	//İş koşulları  kurs '0' dan küçük olamaz ve aynı isimle kurs olmaz
	
	List<Course> courses = new ArrayList<>();

	
	public void addCourse(Course course) throws Exception{
		
		if(course.getCourseUnitPrice()<0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		
		for (Course  courses: courses) {
			if(courses.getCourseName().toUpperCase().equals(course.getCourseName().toUpperCase())==true) {//kur
				throw new Exception("Bu Kurs adı bulunmaktadır!!!");
			}
		}
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	public void deleteCourse(Course course) throws Exception{
		for (Course courses : courses) {

			if(course.getCourseName().toUpperCase().equals(courses.getCourseName().toUpperCase())==false) { //Silenecek kurs listede yoksa hata fırlat
				throw new Exception("Böyle bir kurs yoktur!!");
				
			}
				
		}
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}
}
