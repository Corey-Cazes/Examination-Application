
//Imports
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class DropDownSetupGUI extends JFrame {

	JFrame thisFrame;

	private String[] numbers = { "1", "2", "3", "4", "5" };

	public HintTextField questionField = new HintTextField("Enter Question Here");
	public HintTextField ChoiceField1 = new HintTextField("Enter First Choice Here");
	public HintTextField ChoiceField2 = new HintTextField("Enter Second Choice Here");
	public HintTextField ChoiceField3 = new HintTextField("Enter Third Choice Here");
	public HintTextField ChoiceField4 = new HintTextField("Enter Fourth Choice Here");
	public HintTextField ChoiceField5 = new HintTextField("Enter Fifth Choice Here");
	JComboBox<?> numBox = new JComboBox<Object>(numbers);

	public Node<?> tempNode = Test.tests.getLast();

	public Test tempTest = (Test) tempNode.getItem();

	public DropDown dropDown = new DropDown();

	// Constructor - this runs first
	DropDownSetupGUI() {
		super("Examination Application");
		this.thisFrame = this; // lol

		// configure the window
		this.setSize(600, 400);
		this.setLocationRelativeTo(null); // start the frame in the center of the screen
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		// Create a Panel for stuff
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JPanel choicePanelMain = new JPanel();
		choicePanelMain.setLayout(new BoxLayout(choicePanelMain, BoxLayout.PAGE_AXIS));

		JLabel startLabel = new JLabel("Drop Down Menu Setup");
		startLabel.setPreferredSize(new Dimension(500, 50));

		JButton doneButton = new JButton("Done");
		doneButton.setSize(new Dimension(200, 30));
		doneButton.addActionListener(new DoneButtonListener());

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(doneButton);

		// create a Panel for the Choices
		JPanel questionPanel = new JPanel();
		questionPanel.setLayout(new FlowLayout());

		JPanel choicePanel1 = new JPanel();
		choicePanel1.setLayout(new FlowLayout());
		JPanel choicePanel2 = new JPanel();
		choicePanel2.setLayout(new FlowLayout());
		JPanel choicePanel3 = new JPanel();
		choicePanel3.setLayout(new FlowLayout());
		JPanel choicePanel4 = new JPanel();
		choicePanel4.setLayout(new FlowLayout());
		JPanel choicePanel5 = new JPanel();
		choicePanel5.setLayout(new FlowLayout());
		JPanel correctAnswerPanel = new JPanel();
		correctAnswerPanel.setLayout(new FlowLayout());

		// Create two JButtons for the centerPanel
		JLabel questionLabel = new JLabel("Question: ");
		questionLabel.setSize(new Dimension(200, 30));

		JLabel Choice1Label = new JLabel("Choice 1: ");
		Choice1Label.setSize(new Dimension(200, 50));
		JLabel Choice2Label = new JLabel("Choice 2: ");
		Choice2Label.setSize(new Dimension(200, 50));
		JLabel Choice3Label = new JLabel("Choice 3: ");
		Choice3Label.setSize(new Dimension(200, 50));
		JLabel Choice4Label = new JLabel("Choice 4: ");
		Choice4Label.setSize(new Dimension(200, 50));
		JLabel Choice5Label = new JLabel("Choice 5: ");
		Choice5Label.setSize(new Dimension(200, 50));
		JLabel correctAnswerLabel = new JLabel("Correct Answer: ");
		correctAnswerLabel.setSize(new Dimension(200, 50));

		questionField.setPreferredSize(new Dimension(200, 30));

		ChoiceField1.setPreferredSize(new Dimension(200, 30));

		ChoiceField2.setPreferredSize(new Dimension(200, 30));

		ChoiceField3.setPreferredSize(new Dimension(200, 30));

		ChoiceField4.setPreferredSize(new Dimension(200, 30));

		ChoiceField5.setPreferredSize(new Dimension(200, 30));

		numBox.setSelectedIndex(0);

		// add the buttons to the buttonPanel
		questionPanel.add(questionLabel);
		questionPanel.add(questionField);
		choicePanel1.add(Choice1Label);
		choicePanel1.add(ChoiceField1);
		choicePanel2.add(Choice2Label);
		choicePanel2.add(ChoiceField2);
		choicePanel3.add(Choice3Label);
		choicePanel3.add(ChoiceField3);
		choicePanel4.add(Choice4Label);
		choicePanel4.add(ChoiceField4);
		choicePanel5.add(Choice5Label);
		choicePanel5.add(ChoiceField5);
		correctAnswerPanel.add(correctAnswerLabel);
		correctAnswerPanel.add(numBox);

		choicePanelMain.add(questionPanel);
		choicePanelMain.add(choicePanel1);
		choicePanelMain.add(choicePanel2);
		choicePanelMain.add(choicePanel3);
		choicePanelMain.add(choicePanel4);
		choicePanelMain.add(choicePanel5);
		choicePanelMain.add(correctAnswerPanel);

		// Add all panels to the mainPanel according to border layout
		mainPanel.add(choicePanelMain, BorderLayout.WEST);
		mainPanel.add(startLabel, BorderLayout.NORTH);
		mainPanel.add(buttonPanel, BorderLayout.EAST);

		// add the main panel to the frame
		this.add(mainPanel);

		// Start the app
		this.setVisible(true);
	}

	// This is an inner class that is used to detect a button press
	class DoneButtonListener implements ActionListener { // this is the required class definition
		public void actionPerformed(ActionEvent event) {
			dropDown.question = questionField.getText().toString();
			dropDown.addAnswer(ChoiceField1.getText().toString());
			dropDown.addAnswer(ChoiceField2.getText().toString());
			dropDown.addAnswer(ChoiceField3.getText().toString());
			dropDown.addAnswer(ChoiceField4.getText().toString());
			dropDown.addAnswer(ChoiceField5.getText().toString());
			dropDown.setAnswerKeyAsInt(numBox.getSelectedIndex());

			System.out.println("Multiple Choice Added: ");
			System.out.println("Question: " + questionField.getText().toString());
			System.out.println("Choice 1: " + ChoiceField1.getText().toString());
			System.out.println("Choice 2: " + ChoiceField2.getText().toString());
			System.out.println("Choice 3: " + ChoiceField3.getText().toString());
			System.out.println("Choice 4: " + ChoiceField4.getText().toString());
			System.out.println("Choice 5: " + ChoiceField5.getText().toString());
			System.out.println("Correct Choice: " + numBox.getSelectedIndex());
			tempTest.addDropDown(dropDown);
			new QuestionTypeGUI();
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
