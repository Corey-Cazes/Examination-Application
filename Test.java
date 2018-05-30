/* The Test Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Test {
	
	//Class Variables
	private SimpleLinkedList questions = new SimpleLinkedList();
	private SimpleLinkedList coursesAvailable = new SimpleLinkedList();
	
	/* The Get Questions method
	 * @returns list of questions
	 */
	public SimpleLinkedList getQuestions() {
		return questions;
	}
	
	/* The setQuestions method
	 * @param questions List of questions on test
	 * Sets List of Questions on test
	 */
	public void setQuestions(SimpleLinkedList questions) {
		this.questions = questions;
	}
	
	/* The Get Courses Available method
	 * @returns List of courses the test is available to
	 */
	public SimpleLinkedList getCoursesAvailable() {
		return coursesAvailable;
	}
	
	/* The setCoursesAvailable method
	 * @param coursesAvailable List of courses available to the test
	 * Sets List of Courses available to the test
	 */
	public void setCoursesAvailable(SimpleLinkedList coursesAvailable) {
		this.coursesAvailable = coursesAvailable;
	}

}
