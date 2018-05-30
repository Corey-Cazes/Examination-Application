//Imports
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class MultipleChoiceSetupGUI extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  MultipleChoiceSetupGUI() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    
    
    //configure the window
    this.setSize(500,300);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    String [] numbers = {"1","2","3","4"};
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    
    JPanel choicePanelMain = new JPanel();
    choicePanelMain.setLayout(new BoxLayout(choicePanelMain, BoxLayout.PAGE_AXIS));
    
    JLabel startLabel = new JLabel("Multiple Choice Setup");
    startLabel.setPreferredSize(new Dimension(500,50));
    
    
    JButton doneButton = new JButton("Done");
    doneButton.setSize(new Dimension(200,30));
    doneButton.addActionListener(new DoneButtonListener());
  
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(doneButton);
    
    //create a Panel for the Choices
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
    JPanel correctAnswerPanel = new JPanel();
    correctAnswerPanel.setLayout(new FlowLayout());
    
     //Create two JButtons for the centerPanel
    JLabel questionLabel = new JLabel("Question: ");
    questionLabel.setSize(new Dimension(200,30));
    JLabel Choice1Label = new JLabel("Choice 1: ");
    Choice1Label.setSize(new Dimension(200,50));
    JLabel Choice2Label = new JLabel("Choice 2: ");
    Choice2Label.setSize(new Dimension(200,50));
    JLabel Choice3Label = new JLabel("Choice 3: ");
    Choice3Label.setSize(new Dimension(200,50));
    JLabel Choice4Label = new JLabel("Choice 4: ");
    Choice4Label.setSize(new Dimension(200,50));
    JLabel correctAnswerLabel = new JLabel("Correct Answer: ");
    correctAnswerLabel.setSize(new Dimension(200,50));
    
    JTextField questionField = new JTextField("Enter Question Here");
    questionField.setSize(new Dimension(300,50));
    JTextField ChoiceField1 = new JTextField("Enter First Choice Here");
    ChoiceField1.setSize(new Dimension(300,50));
    JTextField ChoiceField2 = new JTextField("Enter Second Choice Here");
    ChoiceField2.setSize(new Dimension(300,50));
    JTextField ChoiceField3 = new JTextField("Enter Third Choice Here");
    ChoiceField3.setSize(new Dimension(300,50));
    JTextField ChoiceField4 = new JTextField("Enter Fourth Choice Here");
    ChoiceField4.setSize(new Dimension(300,50));
    JComboBox<?> numBox = new JComboBox<Object>(numbers);
    numBox.setSelectedIndex(0);
    
 
    
    

    //add the buttons to the buttonPanel
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
correctAnswerPanel.add(correctAnswerLabel);
correctAnswerPanel.add(numBox);

choicePanelMain.add(questionPanel);
choicePanelMain.add(choicePanel1);
choicePanelMain.add(choicePanel2);
choicePanelMain.add(choicePanel3);
choicePanelMain.add(choicePanel4);
choicePanelMain.add(correctAnswerPanel);
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(choicePanelMain,BorderLayout.WEST);
    mainPanel.add(startLabel,BorderLayout.NORTH);
    mainPanel.add(buttonPanel,BorderLayout.EAST);
    
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
  class DoneButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      new QuestionTypeGUI();
      thisFrame.dispose();
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}
