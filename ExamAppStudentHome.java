//header

//student homepage
//shows their grades & tests avaiavle

//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ExamAppStudentHome extends JFrame{
  
  JFrame thisFrame;
  
  //constructor
  ExamAppStudentHome(Student currentStudent) {
    super("Examination Application");
    this.thisFrame = this;
    
    //configure the window
    this.setSize(400,150);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    //set layout lol
    
    //Create Labels, Buttons, Etc
    JLabel topLabel = new JLabel("Student Homepage");
    JLabel nameLabel = new JLabel("Welcome, "+ currentStudent.firstName);
    JButton gradesButton = new JButton("View Grades");
    gradesButton.putClientProperty("Student", currentStudent);
    gradesButton.addActionListener(new GradesButtonListener());
    JButton testButton = new JButton("Take Tests");
    testButton.putClientProperty("Student", currentStudent);
    testButton.addActionListener(new TestButtonListener());
    JButton logoutButton = new JButton("Log out");
    logoutButton.addActionListener(new LogoutButtonLsitener());
    
    //add stuff to panels
    buttonPanel.add(gradesButton);
    buttonPanel.add(testButton);
    buttonPanel.add(logoutButton);
    
    //add stuff to mainpanel
    mainPanel.add(topLabel,BorderLayout.NORTH);
    mainPanel.add(nameLabel,BorderLayout.CENTER);
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    
    //add mainpanel to frame
    this.add(mainPanel);
    
    //start
    this.setVisible(true);
    
  }
  
  //action listeners for buttons
  //test button
  class TestButtonListener implements ActionListener { 
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Showing list of tests");
      Student currentStudent = ((Student)((JButton)event.getSource()).getClientProperty("Student"));
      new ExamAppStudentTest(currentStudent);
      thisFrame.dispose();
    }
  }
  //grades button
  class GradesButtonListener implements ActionListener { 
    public void actionPerformed(ActionEvent event)  {  
      System.out.println("Showing list of grades");
      Student currentStudent = ((Student)((JButton)event.getSource()).getClientProperty("Student"));
      new ExamAppStudentGrades(currentStudent);
      thisFrame.dispose();
    }
  }
  
  //logout button
  class LogoutButtonLsitener implements ActionListener {
    public void actionPerformed (ActionEvent event) {
      System.out.println("Logging Out");
      //sometjhing should go here to save all the stuff to filei/o so the program doesnt get reset every time
      new ExaminationAppTitleFrame();
      thisFrame.dispose();
    }
  }
  
}