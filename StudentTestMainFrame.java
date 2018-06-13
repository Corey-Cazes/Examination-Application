public class StudentTestMainFrame{
	
	private static Test test;
	private static SimpleLinkedList<Question> questionList;
	private static int mark = 0;
	

	public static Test getTest() {
		return test;
	}

	public static void setTest(Test test) {
		StudentTestMainFrame.test = test;
	}
	
	
		
	public static void initiateTest() {
		if (questionList != null) {
			if (questionList.get(0) instanceof MultipleChoice) {
				new DisplayMultipleChoiceGUI(StudentTestMainFrame.test, 0);
			}else if (questionList.get(0) instanceof DropDown) {
				new DisplayDropDownGUI(StudentTestMainFrame.test, 0);
			}else if (questionList.get(0) instanceof ShortAnswer) {
				new DisplayShortAnswerGUI(StudentTestMainFrame.test, 0);
			}
		}
	}
	
	public static void nextQuestion (int num) {
		if (questionList != null) {
			if (questionList.get(num+1) instanceof MultipleChoice) {
				new DisplayMultipleChoiceGUI(StudentTestMainFrame.test, num);
			}else if (questionList.get(num+1) instanceof DropDown) {
				new DisplayDropDownGUI(StudentTestMainFrame.test, num);
			}else if (questionList.get(num+1) instanceof ShortAnswer) {
				new DisplayShortAnswerGUI(StudentTestMainFrame.test, num);
			}
		}
	}

	public static SimpleLinkedList<Question> getQuestionList() {
		return questionList;
	}

	public static void setQuestionList(SimpleLinkedList<Question> questionList) {
		StudentTestMainFrame.questionList = questionList;
	}

	public static int getMark() {
		return mark;
	}

	public static void setMark(int mark) {
		StudentTestMainFrame.mark = mark;
	}
	
	public static void addMark(int num) {
		StudentTestMainFrame.mark += num;
	}
	
}