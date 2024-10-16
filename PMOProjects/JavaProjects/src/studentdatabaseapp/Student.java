package studentdatabaseapp;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private String studentId;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;

	// Constructor: prompt user to enter student name and year
	public Student(String firstName, String lastName, int gradeYear) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGradeYear() {
		return gradeYear;
	}

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getTuitionBalance() {
		return tuitionBalance;
	}

	public void setTuitionBalance(int tuitionBalance) {
		this.tuitionBalance = tuitionBalance;
	}

	public static int getCostOfCourse() {
		return costOfCourse;
	}

	public static void setCostOfCourse(int costOfCourse) {
		Student.costOfCourse = costOfCourse;
	}

	@Override
	public String toString() {
		return "\nStudent \n firstName=" + firstName + ",\n lastName=" + lastName + ",\n gradeYear=" + gradeYear
				+ ",\n studentId " + studentId + ",\n courses=" + courses + ",\n tuitionBalance=" + tuitionBalance;
	}

}
