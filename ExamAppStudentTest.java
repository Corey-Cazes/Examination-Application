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
  ExamAppStudentTest() {
    super("Examination Application");
    this.thisFrame = this;
    
    //declaring this up heeere
    //declare testList using a method that searches all tests and compares with the current students courses
    Test[] testList = new Test[5];
    testList = loadTestList(currentStudent);
    JComboBox<?> testSelect = new JComboBox<Object>(testList)
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
    goButton.addActionListener(new goButtonListener);
    JButton backButton = new JButton("Back");
    backButton.addActionListener(new backButtonListener);
    
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
      new ExamAppStudentHome();
      thisFrame.dispose();
    }
  }
    
 //methods
 puclic static Test[] loadTestList(currentStudent){
   //for all 5 courses, read through the list of all tests and add the tests for that course to the list
   //return the array of tests
 }
   
}