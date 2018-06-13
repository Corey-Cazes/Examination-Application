
public class ShortAnswer extends Question{

	private SimpleLinkedList<String> answerKey = new SimpleLinkedList<String>();

	public SimpleLinkedList<String> getAnswerKey() {
		return answerKey;
	}

	public void setAnswerKey(SimpleLinkedList<String> answerKey) {
		this.answerKey = answerKey;
	}
	
	public void addAnswer(String answer) {
		this.answerKey.add(answer);
	}
}
