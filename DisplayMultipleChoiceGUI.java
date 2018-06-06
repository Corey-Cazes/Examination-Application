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

  
  
  //Constructor - this runs first
  DisplayMultipleChoiceGUI(Test test, int num) { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
    //configure the window
    this.setSize(400,200);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //SimpleLinkedList listQuestion  = test.getQuestions();
    
    //MultipleChoice multipleChoiceQuestion = (MultipleChoice) listQuestion.get(num);
    
    MultipleChoice multipleChoiceQuestion = new MultipleChoice();
    
    SimpleLinkedList <String> listQuestion = new SimpleLinkedList <String>();
    
    listQuestion.add("1");
    listQuestion.add("2");
    listQuestion.add("3");
    listQuestion.add("4");
    
    multipleChoiceQuestion.setQuestion("What is 2+2");
    multipleChoiceQuestion.setAnswerKeyAsInt(3);
    multipleChoiceQuestion.setAnswers(listQuestion);
   
    
    
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    
    JPanel answerPanel1 = new JPanel(new FlowLayout());
    JPanel answerPanel2 = new JPanel(new FlowLayout());
    JPanel answerPanel3 = new JPanel(new FlowLayout());
    JPanel answerPanel4 = new JPanel(new FlowLayout());
    
    JPanel answerPanel = new JPanel();
    answerPanel.setLayout(new BoxLayout(answerPanel,BoxLayout.PAGE_AXIS));

    
    JLabel question = new JLabel(multipleChoiceQuestion.question);
    JLabel answer1 = new JLabel(multipleChoiceQuestion.getAnswer(1));
    JLabel answer2 = new JLabel(multipleChoiceQuestion.getAnswer(1));
    JLabel answer3 = new JLabel(multipleChoiceQuestion.getAnswer(1));
    JLabel answer4 = new JLabel(multipleChoiceQuestion.getAnswer(1));
    
    JCheckBox box1 = new JCheckBox();
    JCheckBox box2 = new JCheckBox();
    JCheckBox box3 = new JCheckBox();
    JCheckBox box4 = new JCheckBox();
    
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
   
    
    
    
     //Create two JButtons for the centerPanel
    JButton submitAnswerButton = new JButton("Done");
    submitAnswerButton.addActionListener(new DoneButtonListener());
    submitAnswerButton.setSize(new Dimension(200,30));

    
    //Create some JLabels for the centerPanel

    

    //add the buttons to the buttonPanel
    buttonPanel.add(submitAnswerButton);
   
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    mainPanel.add(question, BorderLayout.NORTH);
    mainPanel.add(answerPanel, BorderLayout.WEST);

    
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
  class DoneButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  

      thisFrame.dispose();
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}