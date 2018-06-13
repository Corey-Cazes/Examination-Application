//Imports
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.FlowLayout;

class TeacherLogin extends JFrame { 

  JFrame thisFrame;
  
   public HintTextField loginField = new HintTextField("Enter Password");
   
  
  //Constructor - this runs first
  TeacherLogin() { 
    super("Examination Application");
    this.thisFrame = this; //lol 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   
    
    //configure the window
    this.setSize(400,150);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    JPanel loginPanel = new JPanel();
    loginPanel.setLayout(new FlowLayout());
    
    loginField.setPreferredSize(new Dimension(200,30));
    
    //Create a Panel for stuff
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    JLabel loginLabel = new JLabel("Password: ");
    
    //create a Panel for the buttons
    JPanel buttonPanel = new JPanel();
    //buttonPanel.setLayout(new FlowLayout());
    
     //Create two JButtons for the centerPanel
    JButton loginButton = new JButton("Login");
    loginButton.addActionListener(new LoginButtonListener());
    loginButton.setSize(new Dimension(200,30));
    
    
 
    
    //Create some JLabels for the centerPanel
    JLabel startLabel = new JLabel("Login");
    

    //add the buttons to the buttonPanel       
    buttonPanel.add(loginButton);
    loginPanel.add(loginLabel);
    loginPanel.add(loginField);

    
    //Add all panels to the mainPanel according to border layout
    mainPanel.add(buttonPanel,BorderLayout.SOUTH);
    mainPanel.add(loginPanel, BorderLayout.CENTER);
    mainPanel.add(startLabel,BorderLayout.NORTH);
    
    
    
    
    //add the main panel to the frame
    this.add(mainPanel);
    
    //Start the app
    this.setVisible(true);
  
  }
  
  //This is an inner class that is used to detect a button press
  class LoginButtonListener implements ActionListener {  //this is the required class definition
    public void actionPerformed(ActionEvent event)  {  
    if (Teacher.getPassword().equals(loginField.getText().toString())) {
    	new TeacherHomeGUI();
    	thisFrame.dispose();
    }
      
      // new [name of teacher program]; //create a new FunkyFrame (another file that extends JFrame)
    }
  }
  
  //This is an inner class that is used to detect a button press

  //Main method starts this application
  public static void main(String[] args) { 
    new ExaminationAppTitleFrame();

  }
  

  
}
