
//Imports
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class DisplayMultipleChoiceGUI extends JFrame {

	JFrame thisFrame;

	static int num;
	
	JCheckBox box1 = new JCheckBox();
	JCheckBox box2 = new JCheckBox();
	JCheckBox box3 = new JCheckBox();
	JCheckBox box4 = new JCheckBox();

	// Constructor - this runs first
	DisplayMultipleChoiceGUI(Test test, int num) {
		super("Examination Application");
		this.thisFrame = this; // lol
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// configure the window
		this.setSize(400, 200);
		this.setLocationRelativeTo(null); // start the frame in the center of the screen
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		DisplayMultipleChoiceGUI.num = num;
		 SimpleLinkedList<Question> listQuestion = test.getQuestions();


		MultipleChoice multipleChoiceQuestion = new MultipleChoice();
		
		multipleChoiceQuestion = (MultipleChoice) listQuestion.get(num);



		// Create a Panel for stuff
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		JPanel answerPanel1 = new JPanel(new FlowLayout());
		JPanel answerPanel2 = new JPanel(new FlowLayout());
		JPanel answerPanel3 = new JPanel(new FlowLayout());
		JPanel answerPanel4 = new JPanel(new FlowLayout());

		JPanel answerPanel = new JPanel();
		answerPanel.setLayout(new BoxLayout(answerPanel, BoxLayout.PAGE_AXIS));

		JLabel question = new JLabel(multipleChoiceQuestion.question);
		JLabel answer1 = new JLabel(multipleChoiceQuestion.getAnswer(0));
		JLabel answer2 = new JLabel(multipleChoiceQuestion.getAnswer(1));
		JLabel answer3 = new JLabel(multipleChoiceQuestion.getAnswer(2));
		JLabel answer4 = new JLabel(multipleChoiceQuestion.getAnswer(3));

		box1.addActionListener(new Box1Listener());
		box2.addActionListener(new Box2Listener());
		box3.addActionListener(new Box3Listener());
		box4.addActionListener(new Box4Listener());
		


		answerPanel1.add(box1);
		answerPanel1.add(answer1);
		answerPanel2.add(box2);
		answerPanel2.add(answer2);
		answerPanel3.add(box3);
		answerPanel3.add(answer3);
		answerPanel4.add(box4);
		answerPanel4.add(answer4);

		answerPanel.add(answerPanel1);
		answerPanel.add(answerPanel2);
		answerPanel.add(answerPanel3);
		answerPanel.add(answerPanel4);


		// Create two JButtons for the centerPanel
		JButton submitAnswerButton = new JButton("Done");
		submitAnswerButton.addActionListener(new DoneButtonListener());
		submitAnswerButton.setSize(new Dimension(200, 30));

		// Create some JLabels for the centerPanel

		// add the buttons to the buttonPanel
		buttonPanel.add(submitAnswerButton);

		// Add all panels to the mainPanel according to border layout
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		mainPanel.add(question, BorderLayout.NORTH);
		mainPanel.add(answerPanel, BorderLayout.WEST);

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


	
	  class Box1Listener implements ActionListener {  //this is the required class definition
		    public void actionPerformed(ActionEvent event)  {  
				box2.setSelected(false);
				box3.setSelected(false);
				box4.setSelected(false);
		
		      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
		    }
		  }
	  
	  class Box2Listener implements ActionListener {  //this is the required class definition
		    public void actionPerformed(ActionEvent event)  {  
				box3.setSelected(false);
				box4.setSelected(false);
				box1.setSelected(false);
		
		      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
		    }
		  }
	  
	  class Box3Listener implements ActionListener {  //this is the required class definition
		    public void actionPerformed(ActionEvent event)  {  
				box4.setSelected(false);
				box1.setSelected(false);
				box2.setSelected(false);
		
		      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
		    }
		  }
	  
	  class Box4Listener implements ActionListener {  //this is the required class definition
		    public void actionPerformed(ActionEvent event)  {  
				box1.setSelected(false);
				box2.setSelected(false);
				box3.setSelected(false);
		 
		      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
		    }
		  }

}


