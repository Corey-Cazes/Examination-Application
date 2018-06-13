
//Imports
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

class DisplayShortAnswerGUI extends JFrame {

	JFrame thisFrame;
	
	static int num;



	// Constructor - this runs first
	DisplayShortAnswerGUI(Test test, int num) {
		super("Examination Application");
		this.thisFrame = this; // lol
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DisplayShortAnswerGUI.num = num;

		// configure the window
		this.setSize(500, 300);
		this.setLocationRelativeTo(null); // start the frame in the center of the screen
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
				


		ShortAnswer question = new ShortAnswer();
		
		
		SimpleLinkedList<Question> listQuestion = test.getQuestions();
		
		question = (ShortAnswer) listQuestion.get(num);


		JPanel questionPanel = new JPanel();
		JPanel answerPanel = new JPanel(new FlowLayout());
		
		questionPanel.add(new JLabel(question.getQuestion()));
		
		JTextArea answerField = new JTextArea("Enter Your Text Here", 15, 40);
		answerField.setLineWrap(true);  //this tells it to break the string to fit the TextArea
		answerField.setWrapStyleWord(true);
		
		answerPanel.add(answerField);

		// Create a Panel for stuff
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		mainPanel.add(questionPanel, BorderLayout.NORTH);
		mainPanel.add(answerPanel, BorderLayout.CENTER);

		// Add all panels to the mainPanel according to border layout

		// add the main panel to the frame
		this.add(mainPanel);

		// Start the app
		this.setVisible(true);
	}

	// This is an inner class that is used to detect a button press
	class DoneButtonListener implements ActionListener { // this is the required class definition
		public void actionPerformed(ActionEvent event) {
			StudentTestMainFrame.nextQuestion(num);
			thisFrame.dispose();
			// new [name of teacher program]; //create a new FunkyFrame (another file that
			// extends JFrame)
		}
	}

	// Main method starts this application
	public static void main(String[] args) {
		new ExaminationAppTitleFrame();

	}

}


