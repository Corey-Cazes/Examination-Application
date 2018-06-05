//heeadderr kek

//student create account
//appears when a student not already in the system tries to log in
//takes input of student number, course codes, etc and creates a new student object and adds it to the list
//after object is created, it goes to the homepage

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

class ExamAppStudentCreate extends JFrame {
  
  JFrame thisFrame;
  
  //the text fields have to be declared up here or so i can save the contents
  JTextField idNumberField = new JTextField("ID Number");
  JTextField firstNameField = new JTextField("First Name");
  JTextField lastNameField = new JTextField("Last Name");
  JTextField course1Field = new JTextField("Course Code 1");
  JTextField course2Field = new JTextField("Course Code 2");
  JTextField course3Field = new JTextField("Course Code 3");
  JTextField course4Field = new JTextField("Course Code 4");
  JTextField course5Field = new JTextField("Course Code 5");
  //aforementioned contents
  String idNum;
  String firstName;
  String lastName;
  String course1code;
  String course2code;
  String course3code;
  String course4code;
  String course5code;
  
  //constructor
  ExamAppStudentCreate(){
    super("Examination Application");
    this.thisFrame = this;
    
    //configure the window
    this.setSize(500,300);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    
    //Create panels for the text fields
    JPanel studentNumberPanel = new JPanel();
    studentNumberPanel.setLayout(new FlowLayout());
    JPanel namePanel = new JPanel();
    namePanel.setLayout(new FlowLayout());
    JPanel course1Panel = new JPanel();
    course1Panel.setLayout(new FlowLayout());
    JPanel course2Panel = new JPanel();
    course2Panel.setLayout(new FlowLayout());
    JPanel course3Panel = new JPanel();
    course3Panel.setLayout(new FlowLayout());
    JPanel course4Panel = new JPanel();
    course4Panel.setLayout(new FlowLayout());
    JPanel course5Panel = new JPanel();
    course5Panel.setLayout(new FlowLayout());
    
    //Create labels, buttons, and listeners
    JLabel topLabel = new JLabel("You are not in the system yet. Please Enter your information.");
    JButton finishButton = new JButton("Complete sign up");
    finishButton.addActionListener(new finishButtonListener());
    JLabel numberLabel = new JLabel("Student number: ");
    idNumberField.addActionListener(new NumberSaver());
    JLabel nameLabel = new JLabel("Name: ");
    firstNameField.addActionListener(new firstNameSaver());
    lastNameField.addActionListener(new lastNameSaver());
    JLabel course1Label = new JLabel("Course: ");
    JLabel course2Label = new JLabel("Course: ");
    JLabel course3Label = new JLabel("Course: ");
    JLabel course4Label = new JLabel("Course: ");
    JLabel course5Label = new JLabel("Course: ");
    course1Field.addActionListener(new course1Saver());
    course2Field.addActionListener(new course2Saver());
    course3Field.addActionListener(new course3Saver());
    course4Field.addActionListener(new course4Saver());
    course5Field.addActionListener(new course5Saver()); 
    
    //add everything to the right Panels
    studentNumberPanel.add(numberLabel);
    studentNumberPanel.add(idNumberField);
    namePanel.add(nameLabel);
    namePanel.add(firstNameField);
    namePanel.add(lastNameField);
    course1Panel.add(course1Label);
    course1Panel.add(course1Field);
    course2Panel.add(course2Label);
    course2Panel.add(course2Field);
    course3Panel.add(course3Label);
    course3Panel.add(course3Field);
    course4Panel.add(course4Label);
    course4Panel.add(course4Field);
    course5Panel.add(course5Label);
    course5Panel.add(course5Field);
    
    //add everything to the mainPanel
    mainPanel.add(topLabel);
    mainPanel.add(studentNumberPanel);
    mainPanel.add(namePanel);
    mainPanel.add(course1Panel);
    mainPanel.add(course2Panel);
    mainPanel.add(course3Panel);
    mainPanel.add(course4Panel);
    mainPanel.add(course5Panel);
    mainPanel.add(finishButton);
    
    //add mainPanel to frame
    this.add(mainPanel);
    
    //start the app
    this.setVisible(true);
  }
  
  //text field action listeners
  //student num
  class NumberSaver implements ActionListener{
    public void actionPerformed(ActionEvent event){
      System.out.println("text field listener running - id number");
      idNum= idNumberField.getText();
      System.out.println(idNum);
    }
  }
  //first name
    class firstNameSaver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - first name");
        firstName = firstNameField.getText();
        System.out.println(firstName);
      }
    }
  //last name
    class lastNameSaver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - last name");
        lastName = lastNameField.getText();
        System.out.println(lastName);
      }
    }
  //course 1
    class course1Saver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - course 1");
        course1code = course1Field.getText();
        System.out.println(course1code);
      }
    }
  //course 2
    class course2Saver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - course 2");
        course2code = course2Field.getText();
        System.out.println(course2code);
      }
    }
  //course 3
    class course3Saver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - course 3");
        course3code = course3Field.getText();
        System.out.println(course3code);
      }
    }
  //course 4
    class course4Saver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - course 4");
        course4code = course4Field.getText();
        System.out.println(course4code);
      }
    }
  //course 5
    class course5Saver implements ActionListener{
      public void actionPerformed(ActionEvent event){
        System.out.println("text field listener running - course 5");
        course5code = course5Field.getText();
        System.out.println(course5code);
      }
    }
  
  //button action listener
  class finishButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event)  {
      System.out.println ("pretend this adds you to the system");
      //add the student to the system lemow
      Student newStudent = new Student();
      newStudent.firstName = firstName;
      newStudent.lastName = lastName;
      newStudent.setIDNumber(idNum);
      newStudent.addCourse(course1code);
      newStudent.addCourse(course2code);
      newStudent.addCourse(course3code);
      newStudent.addCourse(course4code);
      newStudent.addCourse(course5code);
      newStudent.studentList.add(newStudent);
      Student currentStudent = newStudent;
      //send the student to their home screen
      new ExamAppStudentHome(currentStudent);
      thisFrame.dispose();
    }
  }
  
    //Main method starts this application
  public static void main(String[] args) { 
    new ExamAppStudentCreate();

  }
  
