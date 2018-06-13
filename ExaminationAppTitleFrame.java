//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.io.File;

class ExaminationAppTitleFrame extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  ExaminationAppTitleFrame() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //configure the window
    this.setSize(400,200);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    
    //create a Panel for the buttons
    JPanel buttonPanel = new JPanel();
    
    
     //Create two JButtons for the centerPanel
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
    loadData();
  }
  
  //This is an inner class that is used to detect a button press
  class TeacherButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
     new TeacherLogin();
      thisFrame.dispose();
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  //This is an inner class that is used to detect a button press
  class StudentButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
    new  ExamAppStudentLogin();
      thisFrame.dispose();
      // new [name of student program]; //create a new FunkyFrame (another file that extends JFrame)
    }
    
    //MEthod to load from the file IO
    public static void loadData(){
      //load students
      //create list to hold students
      SimpleLinkedList<Student> readStudentList = new SimpleLinkedList<Student>;
      //initialize file and reader
      File studentFile = new File("studentFile.txt");
      Scanner studentFileScanner = new Scanner(studentFile);
      //read in each student
      while (studentFileScanner.hasNext()){
        Student readStudent = new Student();
        readStudent.setIDNumber(studentFileScanner.next());
        SimpleLinkedList<Object> readGrades = new SimpleLinkedList<Object>;
        for (int gCount = 0; gCount > 5; gCount++){
          readGrades.add(studentFileScanner.next());
        }
        readStudent.setGrades(readGrades);
        SimpleLinkedList<String> readCourses = new SimpleLinkedList<String>;
        for (int cCount = 0; cCount > 5; cCount++){
          readCourses.add(studentFileScanner.next());
        }
        readStudent.setCourses(readCourses);
      //add student to list
        readStudentList.add(readStudent);
      }
      //set universal student list to this one
      Student.studentList = readStudentList;
      //close scanner
      studentFileScanner.close();
      
      //load tests
      //create list to hold tests
      SimpleLinkedList<Test> readTestList = new SimpleLinkedList<Test>;
      //initialize file and reader
      File testFile = new File("testFile.txt");
      Scanner testFileReader = new Scanner(testFile);
      //read in every test
      while(testFileReader.hasNext()){
        Test readTest = new Test();
        readTest.setName(testFileReader.next());
        readTest.setCoursesAvailable(testFileReader.next());
        SimpleLinkedList<Question> readQuestions = new SimpleLinkedList<Question>;
        while(testFileReader.next != "%"){
          Question readQuestion = new Question();
          readQuestion.setType(testFileReader.next());
          readQuestion.setQuestion(testFileReader.next());
          readQuestions.add(readQuestion);
        }
        readTest.setQuestions(readQuestions);
        //add test to list
        readTestList.add(readTest);
      }
      //set universal test list to this one
      Test.tests = readTestList;
      //close Scanner
      testFileReader.close();
  }

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}