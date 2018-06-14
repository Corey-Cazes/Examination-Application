//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

class TeacherHomeGUI extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  TeacherHomeGUI() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
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
    JButton createQuizButton = new JButton("Create Quiz");
    createQuizButton.addActionListener(new TeacherButtonListener());
    createQuizButton.setSize(new Dimension(200,30));
    JButton studentListButton = new JButton("Student List");
    studentListButton.addActionListener(new StudentButtonListener());
    studentListButton.setSize(new Dimension(200,30)); 
    JButton logOutButton = new JButton("Log Out");
    logOutButton.addActionListener(new LogOutButtonListener());
    logOutButton.setSize(new Dimension(200,30)); 
    
    //Create some JLabels for the centerPanel
    JLabel startLabel = new JLabel("This is the Teacher Home Screen");
    

    //add the buttons to the buttonPanel       
    buttonPanel.add(createQuizButton);
    buttonPanel.add(studentListButton);
    buttonPanel.add(logOutButton);
    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    mainPanel.add(startLabel,BorderLayout.NORTH);
    
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  
  //This is an inner class that is used to detect a button press
  class TeacherButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
    Test.tests.add(new Test());
    	new QuestionTypeGUI();
      thisFrame.dispose();
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  //This is an inner class that is used to detect a button press
  class StudentButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
    System.out.println("HeyHeyJeu");  
    	new StudentTable();
      thisFrame.dispose();
      // new [name of student program]; //create a new FunkyFrame (another file that extends JFrame)
      
    }
  }
  
  //This is an inner class that is used to detect a button press
  class LogOutButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
    	new ExaminationAppTitleFrame();
      thisFrame.dispose();
      // new [name of student program]; //create a new FunkyFrame (another file that extends JFrame)
      
    }
  }

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  
}
