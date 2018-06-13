
//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class DisplayDropDownGUI extends JFrame {

	JFrame thisFrame;
	
	static int num;

	JComboBox<String> dropDown = new JComboBox<String>();

	// Constructor - this runs first
	DisplayDropDownGUI(Test test, int num) {
		super("Examination Application");
		this.thisFrame = this; // lol
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// configure the window
		this.setSize(400, 200);
		this.setLocationRelativeTo(null); // start the frame in the center of the screen
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		DisplayDropDownGUI.num = num;
		
		SimpleLinkedList<?> listQuestion = test.getQuestions();
		DropDown dropDownQuestion = new DropDown();
		dropDownQuestion = (DropDown) listQuestion.get(num);
		
		SimpleLinkedList <String>listAnswers = dropDownQuestion.getAnswers();
		
		
		
		String [] answers = new String [5];
		
		answers[0] =  listAnswers.get(0);
		answers[1] =  listAnswers.get(1);
		answers[2] =  listAnswers.get(2);
		answers[3] =  listAnswers.get(3);
		answers[4] =  listAnswers.get(4);

		

		
    dropDown.addItem(answers[0]);
    dropDown.addItem(answers[1]);
    dropDown.addItem(answers[2]);
    dropDown.addItem(answers[3]);
    dropDown.addItem(answers[4]);


	JPanel buttonPanel = new JPanel(new FlowLayout());
    
		JButton doneButton = new JButton("Done");
		doneButton.setPreferredSize(new Dimension(200,30));
		doneButton.addActionListener(new DoneButtonListener());
		
		buttonPanel.add(doneButton);


		// Create a Panel for stuff
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		JLabel questionLabel = new JLabel(dropDownQuestion.getQuestion());
		
		
		mainPanel.add(questionLabel, BorderLayout.NORTH);
		mainPanel.add(dropDown, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);

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


