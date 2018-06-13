//header

//student homepage
//shows their grades & tests avaiavle

//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

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
    JLabel nameLabel = new JLabel("Welcome, "+ currentStudent.getFirstName());
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
      //save stuff to the file IO
      saveData();
      new ExaminationAppTitleFrame();
      thisFrame.dispose();
    }
  }
  
  //METHODS
  //save data to file i/o
  //gets all the students and tests and saves them to some files
  public static void saveData(){
    //obtain the data
    SimpleLinkedList<Student> studentList = currentStudent.studentList;
    SimpleLinkedList<Test> testList = Test.tests;
    //save the students to a file
    //declare file+printwriter
    File studentFile = new File ("studentFile.txt");
    PrintWriter studentFileWriter = new PrintWriter(studentFile);
    //print each student
    for (int sCount = 0; sCount < studentList.size(); sCount++){
      Student printStudent = studentList.get(sCount);
      studentFileWriter.println( (printStudent.getIDNumber())+" "+(printStudent.getGrades.get(0))+" "+(printStudent.getGrades.get(1))+" "+(printStudent.getGrades.get(2))+" "+(printStudent.getGrades.get(3))+" "+(printStudent.getGrades.get(4))+" "+
                                (printStudent.getCourses.get(0))+" "+(printStudent.getCourses.get(2))+" "+(printStudent.getCourses.get(3))+" "+(printStudent.getCourses.get(4))+" "+(printStudent.getCourses.get(5)));
    }
    //close printwriter
    studentFileWriter.close();
    
    //save the tests to a file
    //declare file+printwriter
    File testFile = new File ("testFile.txt");
    PrintWriter testFileWriter = new PrintWriter(testFile);
    //print each test
    for (int tCount = 0; tCount < testList.size(); tCount++){
      Test printTest = testList.get(tCount);
      testFileWriter.println( (printTest.getName())+" "(printTest.getCourse()));
      SimpleLinkedList<Question> questionList = printTest.getQuestions();
      for (int qCount = 0; qCount < questionList.size(); qCount++){
        printQuestion = questionList.get(qCount);
        testFileWriter.println( (printQuestion.getType())+" "+(printQuestion.getQuestion()));
      }
      testFileWriter.println("%");
    }
    //close printwriter
    testFileWriter.close();
  }
  
}