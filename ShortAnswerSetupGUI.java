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
import java.awt.TextField;

class ShortAnswerSetupGUI extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  ShortAnswerSetupGUI() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    
    
    //configure the window
    this.setSize(600,400);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    
    JPanel choicePanelMain = new JPanel();
    choicePanelMain.setLayout(new BoxLayout(choicePanelMain, BoxLayout.PAGE_AXIS));
    
    JLabel startLabel = new JLabel("Short Answer Choice Setup");
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
    JPanel choicePanel5 = new JPanel();
    choicePanel5.setLayout(new FlowLayout());
    
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
    JLabel Choice5Label = new JLabel("Choice 5: ");
    Choice5Label.setSize(new Dimension(200,50));
    
    HintTextField questionField = new HintTextField("Enter Question Here");
    questionField.setPreferredSize(new Dimension(200,30));
   
   
    HintTextField ChoiceField1 = new HintTextField("Enter Key Phrase Here");
    ChoiceField1.setPreferredSize(new Dimension(200,30));
    HintTextField ChoiceField2 = new HintTextField("Enter Key Phrase Here");
    ChoiceField2.setPreferredSize(new Dimension(200,30));
    HintTextField ChoiceField3 = new HintTextField("Enter Key Phrase Here");
    ChoiceField3.setPreferredSize(new Dimension(200,30));
    HintTextField ChoiceField4 = new HintTextField("Enter Key Phrase Here");
    ChoiceField4.setPreferredSize(new Dimension(200,30));
    HintTextField ChoiceField5 = new HintTextField("Enter Key Phrase Here");
    ChoiceField5.setPreferredSize(new Dimension(200,30));
    
 
    
    

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
choicePanel5.add(Choice5Label);
choicePanel5.add(ChoiceField5);



choicePanelMain.add(questionPanel);
choicePanelMain.add(choicePanel1);
choicePanelMain.add(choicePanel2);
choicePanelMain.add(choicePanel3);
choicePanelMain.add(choicePanel4);
choicePanelMain.add(choicePanel5);
    
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
