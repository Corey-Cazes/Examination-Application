/* The Question Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class Question {

	//Class Variables
	private int type;
	private String question;
	
	/* The Get Type method
	 * @returns Type of question as an integer
	 */
	public int getType() {
		return type;
	}
	
	/* The setType method
	 * @param type The type of question as an integer
	 * Sets type of question
	 */
	public void setType(int type) {
		this.type = type;
	}
	
	/* The Get Question method
	 * @returns Question
	 */
	public String getQuestion() {
		return question;
	}
	
	/* The setQuestion method
	 * @param question The Question
	 * Sets Question
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
}
