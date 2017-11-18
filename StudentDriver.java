/**
 * ---------------------------------------------------------------------------
 * File name: StudentDriver.java
 * Project name: Project 1 - Student
 * ---------------------------------------------------------------------------
 * Creator's name and email: Leandro Nascimento, nascimento@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 11, 2017
 * ---------------------------------------------------------------------------
 */

package rollManager;

import java.util.Scanner;
import javax.swing.JOptionPane;
import util.Menu;

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Sep 11, 2017
 * <hr>
 * @author Leandro Nascimento
 */
public class StudentDriver
{

	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Sep 11, 2017
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Scanner kb = new Scanner (System.in);		// Initialize Scanner Class to allow user's input via Keyboard
		Student student = null;						// Initialize student from Student Class and set to null
		
			
		// Display a Welcome Message
		JOptionPane.showMessageDialog(null,
									"                 Welcome to the Class Roll Book 1.00" +
									"\n                 Developed by: Leandro Nascimento " +
									"\nThis program was designed to manage Student's classes enrollment. " +
									"\n© 2017 Nascimento's Software Inc. ALL RIGHTS RESERVED",
									"Welcome Message",
									JOptionPane.PLAIN_MESSAGE);
											
		// Ask for User's input - User's First Name in order to know who is the user operating the system
		String userFirstName =	 JOptionPane.showInputDialog (null,
    				"Enter your first name:",
    				"User Information",
    				JOptionPane.QUESTION_MESSAGE);
		
		// Ask for User's input - User's Last Name in order to know who is the user operating the system
		String userLastName =	 JOptionPane.showInputDialog (null,
					"Enter your last name:",
					"User Information",
					JOptionPane.QUESTION_MESSAGE);
		
		// Acknowledge user's name
		JOptionPane.showMessageDialog(null,
			"Hello Mr./Ms. " + userFirstName + " " + userLastName + " let's get started!",
			"Welcome Message",
			JOptionPane.WARNING_MESSAGE);
		
		// Initiate Menu object and give it a title		
		Menu menu = new Menu ("Project 1: Student Menu");
		
		// Add up to 15 choices at a time, at the moment only 3 are required
		menu.addChoice ("Create a new Student");
		menu.addChoice ("Display a Student");
		menu.addChoice ("End the Program");
		
		int choice;		//Prompt the user to make a choice from an existing Menu
		
		while ((choice = menu.getChoice()) != 3)		// If '3' is typed, then it jumps out of the loop and display goodbye message
		{
			switch (choice)
			{
			case 1: 					
			// Ask for User's input - Student Last Name
			String lastName = JOptionPane.showInputDialog (null,
							  "Enter Student's Last Name:",
				    		  "Student's Information",
				    		  JOptionPane.INFORMATION_MESSAGE);
			
			// Ask for User's input - Student's First Name
			String firstName = JOptionPane.showInputDialog (null,
							   "Enter Students's First Name:",
						       "Student's Information",
						       JOptionPane.INFORMATION_MESSAGE);
			
			// Ask for User's input - Student's First Name
			String major = JOptionPane.showInputDialog (null,
							   "Enter Students's Major:",
						       "Student's Information",
						       JOptionPane.INFORMATION_MESSAGE);

			// Ask for User's input - Student's First Name
			String strHoursCompleted = JOptionPane.showInputDialog (null,
							   "Enter Students's Completed Hours:",
						       "Student's Information",
						       JOptionPane.INFORMATION_MESSAGE);
			int hoursCompleted = Integer.parseInt (strHoursCompleted);
			
			// Ask for User's input - Student's First Name
			String strGpa = JOptionPane.showInputDialog (null,
							   "Enter Students's GPA:",
						       "Student's Information",
						       JOptionPane.INFORMATION_MESSAGE);	
			double gpa = Double.parseDouble (strGpa);

			// Ask for User's input - Student's First Name
			String photoPath = JOptionPane.showInputDialog (null,
							   "Enter Students's Photo Path:",
						       "Student's Information",
						       JOptionPane.INFORMATION_MESSAGE);
			
										// Close scanner to avoid resource leak
			
			student = new Student(lastName, firstName, major, hoursCompleted, gpa, photoPath);				
			System.out.println ("\n\nYou added the following Student: " + student);
			
			break;
			
			case 2:		//it will check if a student object exist or not. If does exist, then display Student's Profile, if not, display an informative message
				if(student == null)
				{
					System.out.println ("\nNo student exists. Please use menu choice 1 before trying to display a student");
				} 
					else
				{
						System.out.println (student);
				}
				
				break;
			
			}
			
		
			
		}
		
		// If user selected option 3 in Student's Menu to End the Program, display Goodbye Message
		System.out.println("                                                        ");
		System.out.println("========================================================");
		System.out.println("\tThank you for using the program! Goodbye! ");
		System.out.println("========================================================");
		
		kb.close ( ); 
		
	} // End of main method

} // End of StudentDriver class
