
public class ShortAnswer extends Question{

	private SimpleLinkedList answerKey = new SimpleLinkedList();

	public SimpleLinkedList getAnswerKey() {
		return answerKey;
	}

	public void setAnswerKey(SimpleLinkedList answerKey) {
		this.answerKey = answerKey;
	}
	
	public void addAnswer(String answer) {
		this.answerKey.add(answer);
	}
}
