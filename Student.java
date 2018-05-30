/* The Student Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Student extends Person{

	//Class Variables
	public static SimpleLinkedList studentList = new SimpleLinkedList();
	private int IDNumber;
	private SimpleLinkedList grades = new SimpleLinkedList();
	private SimpleLinkedList courses = new SimpleLinkedList();
	
	/* The Get IDNumber method
	 * @returns IDNumber
	 */
	public int getIDNumber() {
		return IDNumber;
	}
	
	/* The setIDNumber method
	 * @param iDNumber Name of person
	 * Sets IDNumber of student
	 */
	public void setIDNumber(int iDNumber) {
		IDNumber = iDNumber;
	}
	
	/* The Get Grades method
	 * @returns Grades list
	 */
	public SimpleLinkedList getGrades() {
		return grades;
		
	}
	
	/* The setGrades method
	 * @param list List of grades
	 * Sets list of grades for student
	 */
	public void setGrades(SimpleLinkedList list) {
		this.grades = list;
	}
	
	/* The Get Courses method
	 * @returns list of courses
	 */
	public SimpleLinkedList getCourses() {
		return courses;
	}
	
	/* The setCourses method
	 * @param list List of Courses
	 * Sets list of Courses for student
	 */
	public void setCourses (SimpleLinkedList list) {
		this.courses = list;
	}
	
}
