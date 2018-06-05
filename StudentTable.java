//Imports
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import java.awt.BorderLayout;

class StudentTable extends JFrame { 

  JFrame thisFrame;
  
  //Constructor - this runs first
  StudentTable() { 
    
    this.thisFrame = this; //lol 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    
    //configure the window
    this.setSize(500,300);    
    this.setLocationRelativeTo(null); //start the frame in the center of the screen
    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    this.setResizable (false);
    
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    new Student("Corey", "072758691");
     new Student("Corey", "072758691");
    new Student("Corey", "072758691");
     new Student("Corey", "072758691");
     new Student("Corey", "072758691");
 
     System.out.println(Student.studentList.getSize());
    
    
    String [] columnNames = {"Name", "Student ID", "Tests Taken", "Mark", "Average"};
    
    
    Object[][] data = new Object [Student.studentList.size()][5];
    
    Student tempStu = new Student();
    
    
    for (int i=0;i<Student.studentList.size();i++) {
    	tempStu = (Student) Student.studentList.get(i);
    	
    	if(tempStu != null) {
    	
    	data[i][0] = tempStu.getFirstName();
    	data[i][1] = new Integer(tempStu.getIDNumber());
    	data[i][2] = "[Tests]";
    	data[i][3] = "[Mark]";
    	data[i][4] = "[Average]";
    	}
    	
    }
    
   
    
    JTable table = new JTable(data, columnNames);
    
   
    
    mainPanel.add(table, BorderLayout.NORTH);
    this.add(mainPanel);
    

    
    

    
    //Start the app
    this.setVisible(true);
  }
  
  public static void main(String[] args) { 
	    new ExaminationAppTitleFrame();

	  }
  

  }
  

  

