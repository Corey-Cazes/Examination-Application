/* The Teacher Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Teacher extends Person{
	
	private static String password = "Computer";
	
	//Class Variables
	private SimpleLinkedList courses = new SimpleLinkedList();
	private SimpleLinkedList students = new SimpleLinkedList();
	private SimpleLinkedList Tests = new SimpleLinkedList();
	
	/* The Get Courses method
	 * @returns List of Courses taught
	 */
	public SimpleLinkedList getCourses() {
		return courses;
	}
	
	/* The setCourses method
	 * @param Courses List of Courses taught
	 * Sets Courses of teacher
	 */
	public void setCourses(SimpleLinkedList courses) {
		this.courses = courses;
	}
	
	/* The Get Students method
	 * @returns List of students taught
	 */
	public SimpleLinkedList getStudents() {
		return students;
	}
	
	/* The setStudents method
	 * @param students List of Students taught
	 * Sets Students taught
	 */
	public void setStudents(SimpleLinkedList students) {
		this.students = students;
	}
	
	/* The Get Tests method
	 * @returns List of tests created
	 */
	public SimpleLinkedList getTests() {
		return Tests;
	}
	
	/* The setTests method
	 * @param tests List of tests created
	 * Sets List of tests created
	 */
	public void setTests(SimpleLinkedList tests) {
		Tests = tests;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Teacher.password = password;
	}

}
