//HEADER LOLOLOLOL

//student types in their id number to log in
//program reads a list of students to find if it has data for that number
//if it does; it "selects" that student
//if it doesnt it runs the student through an "account creation"
//once logged in it goes to studenthomepage

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

class ExamAppStudentLogin extends JFrame {
  
  JFrame thisFrame;
  
  //the text field has to be declared up here or the program freaks its beans
  JTextField numberEntry = new JTextField("Student ID Number");
  //this one is needed in several methods so HYUP
  int IDtoFind;
  
  //constructor
  ExamAppStudentLogin() {
    super("Examination Application");
    this.thisFrame = this; //lol
    
    //configure the window
    this.setSize(400,100);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    //create a panel for the text field
    JPanel textPanel = new JPanel();
    textPanel.setLayout(new FlowLayout());
    
    //Create the Intro Text, Login Button and ID number entry field
    JLabel topLabel = new JLabel("Student Login page");
    JButton loginButton = new JButton("Login");
    loginButton.addActionListener(new LoginButtonListener());
    JLabel textLabel = new JLabel("Username: ");
   // JTextField numberEntry = new JTextField("Student ID Number");
    numberEntry.addActionListener(new NumberSaver());
    
    //add the label and field to textPanel
    textPanel.add(textLabel);
    textPanel.add(numberEntry);
    
    //add eveything to the mainPanel
    mainPanel.add(topLabel, BorderLayout.NORTH);
    mainPanel.add(textPanel, BorderLayout.CENTER);
    mainPanel.add(loginButton, BorderLayout.SOUTH);
    
    //add mainPanel to frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  }
  //action Listener for the text field 
  class NumberSaver implements ActionListener{
    public void actionPerformed(ActionEvent event){
      System.out.println("text field listener running");
      String takenString = numberEntry.getText();
      IDtoFind = Integer.parseInt(takenString,10);
    }
  }
  
  //this detects the button press and acts appropriately
  class LoginButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event)  { 
      System.out.println("Searching for Student");
      //run method to find if the student exists or not
      //if true -> set current student to whoever just logged in and run studentHomepage
      //if false -> run studentCreate
    }
  }
  
  //method to find if the student exists and return a boolean
  //reads list of students and compares ID numbers
  
}