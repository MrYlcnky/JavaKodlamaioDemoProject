package JavaKodlamaioDemoProject.entities;

public class Course {
	
	private String courseName;
	private int courseId;
	private double courseUnitPrice;
	
	public Course() {
	// super();
	}

	public Course(String courseName, int courseId, double courseUnitPrice) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.courseUnitPrice = courseUnitPrice;
	}
	
	
	//  get & set
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public double getCourseUnitPrice() {
		return courseUnitPrice;
	}

	public void setCourseUnitPrice(double courseUnitPrice) {
		this.courseUnitPrice = courseUnitPrice;
	}
	
	
	
}
