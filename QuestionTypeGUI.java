//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import java.awt.Dimension;

class QuestionTypeGUI extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  QuestionTypeGUI() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    
    //configure the window
    this.setSize(500,300);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    //create a Panel for the buttons
    JPanel buttonPanel = new JPanel();
    //buttonPanel.setLayout(new FlowLayout());
    
     //Create two JButtons for the centerPanel
    JButton multipleChoiceButton = new JButton("MultipleChoice");
    multipleChoiceButton.addActionListener(new MultipleChoiceButtonListener());
    multipleChoiceButton.setSize(new Dimension(200,30));
    JButton dropDownButton = new JButton("DropDown");
    dropDownButton.addActionListener(new DropDownButtonListener());
    dropDownButton.setSize(new Dimension(200,30)); 
    JButton shortAnswerButton = new JButton("Short Answer");
    shortAnswerButton.addActionListener(new ShortAnswerButtonListener());
    shortAnswerButton.setSize(new Dimension(200,30)); 
    
    //Create some JLabels for the centerPanel
    JLabel startLabel = new JLabel("Choose the type of question");
    

    //add the buttons to the buttonPanel
    buttonPanel.add(multipleChoiceButton);
    buttonPanel.add(dropDownButton);
    buttonPanel.add(shortAnswerButton);
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    mainPanel.add(startLabel,BorderLayout.NORTH);
    
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
  class MultipleChoiceButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      new MultipleChoiceSetupGUI();
      thisFrame.dispose();
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  //This is an inner class that is used to detect a button press
  class DropDownButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Running Student GUI");
      thisFrame.dispose();
      // new [name of student program]; //create a new FunkyFrame (another file that extends JFrame)
      
    }
  }
  
  //This is an inner class that is used to detect a button press
  class ShortAnswerButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Running Student GUI");
      thisFrame.dispose();
      // new [name of student program]; //create a new FunkyFrame (another file that extends JFrame)
      
    }
  }

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}
