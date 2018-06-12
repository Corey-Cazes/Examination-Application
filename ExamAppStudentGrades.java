//heedeer

//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ExamAppStudentGrades extends JFrame{
  
  JFrame thisFrame;
  
  //constructor
  ExamAppStudentGrades(Student currentStudent) {
    super("Examination Application");
    this.thisFrame = this;
  
    //configure the window
    this.setSize(500,400);
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create panels
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    
    //load variables for labels
    SimpleLinkedList<String> courseList = currentStudent.getCourses();
    SimpleLinkedList<Object> gradesList = currentStudent.getGrades();
    //create labels, buttons, listeners
    JLabel topLabel = new JLabel("Grades for " + currentStudent.getFirstName());
    JLabel course1label = new JLabel(courseList.get(0) + ":  " + gradesList.get(0));
    JLabel course2label = new JLabel(courseList.get(1) + ":  " + gradesList.get(1));
    JLabel course3label = new JLabel(courseList.get(2) + ":  " + gradesList.get(2));
    JLabel course4label = new JLabel(courseList.get(3) + ":  " + gradesList.get(3));
    JLabel course5label = new JLabel(courseList.get(4) + ":  " + gradesList.get(4));
    JButton backButton = new JButton("Back");
    backButton.putClientProperty("Student", currentStudent);
    backButton.addActionListener(new backButtonListener());
    
    //add stuff to panel
    mainPanel.add(topLabel);
    mainPanel.add(course1label);
    mainPanel.add(course2label);
    mainPanel.add(course3label);
    mainPanel.add(course4label);
    mainPanel.add(course5label);
    mainPanel.add(backButton);
    
    //add panel to frame
    this.add(mainPanel);
    
    //start
    this.setVisible(true);
}
  
  //button listener
  //back button
 class backButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Bye");
      Student currentStudent = ((Student)((JButton)event.getSource()).getClientProperty("Student"));
      new ExamAppStudentHome(currentStudent);
      thisFrame.dispose();
    }
  }
}