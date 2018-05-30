/* The Test Class
 * Authors: Corey Cazes and Dawn Murphy
 * Date: May 30, 2018
 * Super Class for all other person type objects
 */
public class MultipleChoice extends Question {

	private SimpleLinkedList answers = new SimpleLinkedList();
	private String answerKey;
	private int answerKeyAsInt;
	
	MultipleChoice(){
		this.answerKey = "[Answer Key]";
		this.answerKeyAsInt = -1;
		this.type = 1;
	}
	
	public SimpleLinkedList getAnswers() {
		return answers;
	}
	public void setAnswers(SimpleLinkedList answers) {
		this.answers = answers;
	}
	public String getAnswerKey() {
		return answerKey;
	}
	public void setAnswerKey(String answerKey) {
		this.answerKey = answerKey;
	}
	public int getAnswerKeyAsInt() {
		return answerKeyAsInt;
	}
	public void setAnswerKeyAsInt(int answerKeyAsInt) {
		this.answerKeyAsInt = answerKeyAsInt;
	}
	
	
}
