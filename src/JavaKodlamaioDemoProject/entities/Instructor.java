package JavaKodlamaioDemoProject.entities;

public class Instructor {
	private String instructorName;
	private String instructorLastName;
	private int instructorId;
	
	public Instructor() {
		//super();
	}

	public Instructor(String instructorName, String instructorLastName, int instructorId) {
		super();
		this.instructorName = instructorName;
		this.instructorLastName = instructorLastName;
		this.instructorId = instructorId;
	}

		// get & set
	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	
	
	
	
}

