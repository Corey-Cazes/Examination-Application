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

class ExaminationAppTitleFrame extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  ExaminationAppTitleFrame() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    
    //configure the window
    this.setSize(400,200);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    //create a Panel for the buttons
    JPanel buttonPanel = new JPanel();
    //buttonPanel.setLayout(new FlowLayout());
    
     //Create two JButtons for the buttonPanel
    JButton teacherButton = new JButton("Teacher");
    teacherButton.addActionListener(new TeacherButtonListener());
    teacherButton.setSize(new Dimension(200,30));
    JButton studentButton = new JButton("Student");
    studentButton.addActionListener(new StudentButtonListener());
    studentButton.setSize(new Dimension(200,30)); 
    
    //Create some JLabels for the centerPanel
    JLabel startLabel = new JLabel("Welcome to Examination Application");
    JLabel startLabel2 = new JLabel("I am a...");

    //add the buttons to the buttonPanel
    buttonPanel.add(teacherButton);
    buttonPanel.add(studentButton);
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    mainPanel.add(startLabel,BorderLayout.NORTH);
    mainPanel.add(startLabel2,BorderLayout.CENTER);
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
  class TeacherButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Running Teacher GUI");
      new TeacherHomeGUI();
      thisFrame.dispose();
    }
  }
  
  //This is an inner class that is used to detect a button press
  class StudentButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Running Student GUI");
      new ExamAppStudentLogin();
      thisFrame.dispose();
    }
  }

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}
