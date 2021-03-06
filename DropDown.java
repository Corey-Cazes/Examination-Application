
public class DropDown extends Question{
	
	private SimpleLinkedList<String> answers = new SimpleLinkedList<String>();
	private String answerKey;
	private int answerKeyAsInt;
	
	DropDown(){
		this.answerKey = "[Answer Key]";
		this.answerKeyAsInt = -1;
		this.type = 1;
	}
	
	public SimpleLinkedList<String> getAnswers() {
		return answers;
	}
	public void setAnswers(SimpleLinkedList<String> answers) {
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
		this.answerKeyAsInt = answerKeyAsInt+1;
	}
	
	public void addAnswer(String answer) {
		this.answers.add(answer);
	}

}
