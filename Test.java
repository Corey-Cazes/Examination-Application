/* The Test Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Test {

	
	static SimpleLinkedList<Test> tests = new SimpleLinkedList<Test>();
	
	//Class Variables
	private SimpleLinkedList<Question> questions = new SimpleLinkedList<Question>();
	private String course;
	private String name;
	
	Test(){
		System.out.println("New Test Created");
	}
	
	/* The Get Questions method
	 * @returns list of questions
	 */
	public SimpleLinkedList<Question> getQuestions() {
		return questions;
	}
	
	/* The setQuestions method
	 * @param questions List of questions on test
	 * Sets List of Questions on test
	 */
	public void setQuestions(SimpleLinkedList<Question> questions) {
		this.questions = questions;
	}
	
	/* The Get Courses Available method
	 * @returns course the test is available to
	 */
	public String getCourse() {
		return course;
	}
	
	public void addMultipleChoice (MultipleChoice question) {
		
		
		questions.add(question);
	}
	
	public void addDropDown (DropDown question) {
		questions.add(question);
	}
	
	public void addShortAnswer (ShortAnswer question) {
		questions.add(question);
	}
	
	/* The setCoursesAvailable method
	 * @param coursesAvailable List of courses available to the test
	 * Sets Course available to the test
	 */
	public void setCoursesAvailable(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
