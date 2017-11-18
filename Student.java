/**
 * ---------------------------------------------------------------------------
 * File name: Student.java
 * Project name: Project 1 - Student
 * ---------------------------------------------------------------------------
 * Creator's name and email: Leandro Nascimento, nascimento@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Sep 11, 2017
 * ---------------------------------------------------------------------------
 */

package rollManager;


/**
 * Model one individual Student and its respective attributes, such as: Last and First name, Major, Classification, Hours Completed, GPA and etc.
 *
 * <hr>
 * Date created: Sep 11, 2017
 * <hr>
 * @author Leandro Nascimento
 */
public class Student
{
	private	String				lastName		= null;
	private String				firstName		= null;
	private	String				major			= null;
	private Classification		classification	= null;
	private int					hoursCompleted;
	private double				gpa;
	private String				photoPath		= null;
	
	/**
	 * Default Constructor        
	 *
	 * <hr>
	 * Date created: Sep 11, 2017 
	 * 
	 * @param none
	 */
	public Student ()
	{
		this.lastName = "No Last Name informed";
		this.firstName = "No First Name informed";
		this.major = "No Major informed";
		this.classification = null;
		this.hoursCompleted = 0;
		this.gpa = 0.00;
		this.photoPath = "No Photo Path informed";
	}
	
	/**
	 * Parameterized Constructor        
	 *
	 * <hr>
	 * Date created: Sep 11, 2017 
	 * 
	 * @param lastName - Student's Last Name
	 * @param firstName - Student's First Name
	 * @param major - Student's Major represented by 4 characters (example: CSCI)
	 * @param classification - Student's Classification (example: Junior)
	 * @param hoursCompleted - An integer that represents how many hours the student has completed
	 * @param gpa - A double to indicate what is Student's GPA
	 * @param photoPath - Inform the path where the Student's photo is located, including the file name and extension
	 */
	public Student (String lastName, String firstName, String major, int hoursCompleted,
					double gpa, String photoPath)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.major = major;
		this.hoursCompleted = hoursCompleted;
		this.classification = getClassification();	// Classification will be defined based on how many hours the student has completed
		this.gpa = gpa;
		this.photoPath = photoPath;
	}

	
	/**
	 * @return lastName
	 */
	public String getLastName ( )
	{
		return lastName;
	}

	
	/**
	 * @param lastName the Last Name to set
	 */
	public void setLastName (String lastName)
	{
		this.lastName = lastName;
	}

	
	/**
	 * @return firstName
	 */
	public String getFirstName ( )
	{
		return firstName;
	}

	
	/**
	 * @param firstName the First Name to set
	 */
	public void setFirstName (String firstName)
	{
		this.firstName = firstName;
	}

	
	/**
	 * @return major
	 */
	public String getMajor ( )
	{
		return major;
	}

	
	/**
	 * @param major the Major to set
	 */
	public void setMajor (String major)
	{
		this.major = major;
	}

	
	/**
	 * @return classification
	 */
	public Classification getClassification ( )
	{	
		//  During the input, the system collects the number of hours completed, 
		// then the Classification will be defined based on that
		if(getHoursCompleted() < 32)
		{
			classification = Classification.FRESHMAN;
			
		} 
			else if(getHoursCompleted() < 64)
		{
			classification = Classification.SOPHOMORE;
			
		} 
			else if(getHoursCompleted() < 96)
		{
			classification = Classification.JUNIOR;
			
		} 
			else if(getHoursCompleted() < 124)
		{
			classification = Classification.SENIOR;
			
		} 
			else
		{
			classification = Classification.GRADUATE;
			
		}
		
		return classification;
	}

	
	/**
	 * @param classification the Classification to set
	 */
	public void setClassification (Classification classification)
	{	
				
		this.classification = classification;
		
	}

	
	/**
	 * @return hoursCompleted
	 */
	public int getHoursCompleted ( )
	{
		return hoursCompleted;
	}

	
	/**
	 * @param hoursCompleted the Hours Completed to set
	 */
	public void setHoursCompleted (int hoursCompleted)
	{
		this.hoursCompleted = hoursCompleted;
	}

	
	/**
	 * @return gpa
	 */
	public double getGpa ( )
	{
		return gpa;
	}

	
	/**
	 * @param gpa the GPA to set
	 */
	public void setGpa (double gpa)
	{
		this.gpa = gpa;
	}

	
	/**
	 * @return photoPath
	 */
	public String getPhotoPath ( )
	{
		return photoPath;
	}

	
	/**
	 * @param photoPath the Photo Path to set
	 */
	public void setPhotoPath (String photoPath)
	{
		this.photoPath = photoPath;
	}

	/**
	 * Generates a String to represent the Student        
	 *
	 * <hr>
	 * Date created: Sep 11, 2017 
	 *
	 * <hr>
	 * @return the formatted string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return "\n" +
			   "==========================================================" +
						"\n\t   Project 1: STUDENT'S PROFILE\n" +
			   "==========================================================" +
						"\n NAME: " + lastName + ", " + firstName +
						"\n MAJOR: " + major + 
						"\t HOURS: " + hoursCompleted + 
						"\t CLASS: " + classification +
						"\n GPA: " + gpa + 
						"\t PHOTO FILE: " + photoPath;
	}

} // End of Student Class
