//uuu hheader lul

//set up gui and stuff

//show what tests are available to the current student

//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JComboBox;

class ExamAppStudentTest extends JFrame{
  
  JFrame thisFrame;
  
  //constructor
  ExamAppStudentTest(Student currentStudent) {
    super("Examination Application");
    this.thisFrame = this;
    
    //declaring this up heeere
    //declare testList using a method that searches all tests and compares with the current students courses
    SimpleLinkedList<Object> testList = new SimpleLinkedList<Object>();
    testList = loadTestList(currentStudent);
    Test[] testListArray = testArrayCreate(testList);
    JComboBox<?> testSelect = new JComboBox<Object>(testListArray);
    //configure the window
    this.setSize(500,300);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create panels
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    JPanel menuPanel = new JPanel();
  
    //create labels, buttons, dropdown menu
    JLabel topLabel = new JLabel("Select the test you want to take");
    JButton goButton = new JButton("Go");
    goButton.addActionListener(new goButtonListener());
    JButton backButton = new JButton("Back");
    backButton.putClientProperty("Student", currentStudent);
    backButton.addActionListener(new backButtonListener());
    
    //add stuff to panels
    menuPanel.add(testSelect);
    menuPanel.add(goButton);
    mainPanel.add(topLabel);
    mainPanel.add(menuPanel);
    mainPanel.add(backButton);
    
    //add to frame
    this.add(mainPanel);
    
    //start
    this.setVisible(true);
}

//action listeners

//go button
  class goButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Going forwards");
      //new whateverrunstheactualtest();
      thisFrame.dispose();
    }
  }

//back button
 class backButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Bye");
      Student currentStudent = ((Student)((JButton)event.getSource()).getClientProperty("Student"));
      new ExamAppStudentHome(currentStudent);
      thisFrame.dispose();
    }
  }
    
 //methods
 public static SimpleLinkedList<Object> loadTestList(Student currentStudent){
   SimpleLinkedList<Object> theseTests = new SimpleLinkedList<Object>();
   SimpleLinkedList<Object> courseList = currentStudent.getCourses();
   for (int cnt = 0; cnt < courseList.size(); cnt++){
     String theCourse = courseList.get(cnt);
     for (int inCnt = 0; inCnt < Test.tests.size(); inCnt++){
       Test thatTest = Test.tests.get(inCnt);
       String testCourse = thatTest.getCoursesAvailable();
       if (theCourse.equals(testCourse)){
         theseTests.add(thatTest);
       }
     }
   }
   return theseTests;
 }
 
 public static Test[] testArrayCreate(SimpleLinkedList testList){
   Test[] testArray = new Test[5];
   for (int count = 0; count < 5; count++){
     Test thatTest = testList.get(count);
     testArray[count] = thatTest;
   }
   return testArray;
 }
}