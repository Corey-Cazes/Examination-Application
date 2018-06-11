
//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class QuestionTypeGUI extends JFrame {

	JFrame thisFrame;

	// Constructor - this runs first
	QuestionTypeGUI() {
		super("Examination Application");
		this.thisFrame = this; // lol
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// configure the window
		this.setSize(500, 300);
		this.setLocationRelativeTo(null); // start the frame in the center of the screen
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		// Create a Panel for stuff
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JPanel finishButtonPanel = new JPanel();
		finishButtonPanel.setLayout(new FlowLayout());

		// create a Panel for the buttons
		JPanel buttonPanel = new JPanel();
		// buttonPanel.setLayout(new FlowLayout());

		// Create two JButtons for the centerPanel
		JButton multipleChoiceButton = new JButton("MultipleChoice");
		multipleChoiceButton.addActionListener(new MultipleChoiceButtonListener());
		multipleChoiceButton.setSize(new Dimension(200, 30));
		JButton dropDownButton = new JButton("DropDown");
		dropDownButton.addActionListener(new DropDownButtonListener());
		dropDownButton.setSize(new Dimension(200, 30));
		JButton shortAnswerButton = new JButton("Short Answer");
		shortAnswerButton.addActionListener(new ShortAnswerButtonListener());
		shortAnswerButton.setSize(new Dimension(200, 30));
		JButton finishQuizButton = new JButton("Finish Quiz");
		finishQuizButton.addActionListener(new FinishQuizButtonListener());
		finishQuizButton.setPreferredSize(new Dimension(200, 70));

		finishButtonPanel.add(finishQuizButton);

		// Create some JLabels for the centerPanel
		JLabel startLabel = new JLabel("Choose the type of question");

		// add the buttons to the buttonPanel
		buttonPanel.add(multipleChoiceButton);
		buttonPanel.add(dropDownButton);
		buttonPanel.add(shortAnswerButton);

		// Add all panels to the mainPanel according to border layout
		mainPanel.add(finishButtonPanel, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		mainPanel.add(startLabel, BorderLayout.NORTH);

		// add the main panel to the frame
		this.add(mainPanel);

		// Start the app
		this.setVisible(true);
	}

	// This is an inner class that is used to detect a button press
	class MultipleChoiceButtonListener implements ActionListener { // this is the required class definition
		public void actionPerformed(ActionEvent event) {
			new MultipleChoiceSetupGUI();
			thisFrame.dispose();
			// new [name of teacher program]; //create a new FunkyFrame (another file that
			// extends JFrame)
		}
	}

	// This is an inner class that is used to detect a button press
	class DropDownButtonListener implements ActionListener { // this is the required class definition
		public void actionPerformed(ActionEvent event) {
			new DropDownSetupGUI();
			thisFrame.dispose();
			// new [name of student program]; //create a new FunkyFrame (another file that
			// extends JFrame)

		}
	}

	// This is an inner class that is used to detect a button press
	class ShortAnswerButtonListener implements ActionListener { // this is the required class definition
		public void actionPerformed(ActionEvent event) {

			new ShortAnswerSetupGUI();
			thisFrame.dispose();
			// new [name of student program]; //create a new FunkyFrame (another file that
			// extends JFrame)

		}
	}

	class FinishQuizButtonListener implements ActionListener { // this is the required class definition
		public void actionPerformed(ActionEvent event) {
			new CourseSetupGUI();
			thisFrame.dispose();
			// new [name of student program]; //create a new FunkyFrame (another file that
			// extends JFrame)

		}
	}

	// Main method starts this application
	public static void main(String[] args) {
		new ExaminationAppTitleFrame();

	}

}
