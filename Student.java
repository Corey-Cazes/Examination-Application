/* The Student Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Student extends Person{

	//Class Variables
	public static SimpleLinkedList<Student> studentList = new SimpleLinkedList<Student>();
	private String IDNumber;
	private SimpleLinkedList<Object> grades = new SimpleLinkedList<Object>();
	private SimpleLinkedList<Object> courses = new SimpleLinkedList<Object>();
	
	/* The Get IDNumber method
	 * @returns IDNumber
	 */
	public String getIDNumber() {
		return IDNumber;
	}
	
	public Student(String name, String IDNumber) {
		this.setFirstName(name);
		this.setIDNumber(IDNumber);
		
		Student.studentList.add(this);
		
	}
	
	public Student() {
		
	}
	

	
	/* The setIDNumber method
	 * @param iDNumber Name of person
	 * Sets IDNumber of student
	 */
	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}
	
	/* The Get Grades method
	 * @returns Grades list
	 */
	public SimpleLinkedList<Object> getGrades() {
		return grades;
		
	}
	
	/* The setGrades method
	 * @param list List of grades
	 * Sets list of grades for student
	 */
	public void setGrades(SimpleLinkedList<Object> list) {
		this.grades = list;
	}
	
	/* The Get Courses method
	 * @returns list of courses
	 */
	public SimpleLinkedList<Object> getCourses() {
		return courses;
	}
	
	/* The setCourses method
	 * @param list List of Courses
	 * Sets list of Courses for student
	 */
	public void setCourses (SimpleLinkedList<Object> list) {
		this.courses = list;
	}
	
	
	
}
