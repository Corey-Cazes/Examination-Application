//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

class CourseSetupGUI extends JFrame { 

JFrame thisFrame;


  public HintTextField courseField = new HintTextField("Enter the course this test is intended for");
  JLabel courseLabel = new JLabel("Enter Course: ");
  public HintTextField nameField = new HintTextField("Enter the name of the test");
  JLabel nameLabel = new JLabel("Enter Name: ");
  
  public Node<?> tempNode = Test.tests.getLast();
  
  
 public Test tempTest = (Test) tempNode.getItem();
 
 
  //Constructor - this runs first
  CourseSetupGUI() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
    //configure the window
    this.setSize(400,200);    
    this.setLocationRelativeTo(null);
    this.setResizable (false);

    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
   
    
    //create a Panel for the buttons
    JPanel coursePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel namePanel = new JPanel();
    JPanel combinedPanel = new JPanel();
    
    coursePanel.add(courseLabel);
    coursePanel.add(courseField);
    namePanel.add(nameLabel);
    namePanel.add(nameField);
    combinedPanel.add(namePanel);
    combinedPanel.add(coursePanel);
    
    courseField.setPreferredSize(new Dimension(200,30));
    nameField.setPreferredSize(new Dimension(200,30));
    
    
    
     //Create two JButtons for the centerPanel
    JButton doneButton = new JButton("Done");
    doneButton.addActionListener(new DoneButtonListener());
    doneButton.setSize(new Dimension(200,30));

    
    //Create some JLabels for the centerPanel
    JLabel startLabel = new JLabel("Course Setup");


    //add the buttons to the buttonPanel
    buttonPanel.add(doneButton);
    buttonPanel.add(doneButton);
   
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    mainPanel.add(combinedPanel, BorderLayout.CENTER);
    mainPanel.add(startLabel,BorderLayout.NORTH);
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
  class DoneButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
   tempTest.setCoursesAvailable(courseField.getText().toString());
   tempTest.setName(nameField.getText().toString());
    	new TeacherHomeGUI();
      thisFrame.dispose();
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}