# CSCI-1260-Project1
Class Roll Manager - Project 1 - ETSU - Fall 2017

Purpose
Our company has been selected to build a class roll book application.  It is to be developed in several stages.  In the first stage (this project), we are to implement a Student class and demonstrate its functionality with a driver class.  Below, please find detailed specifications.
Specifications
The Student Class
The Student class represents one individual student.  Each student has the following attributes.
1.	Last Name
2.	First Name
3.	Major – 4 character abbreviation
4.	Classification – an enumerated type with possible values: Freshman, Sophomore, Junior, Senior, Graduate, Other.  This type should be defined in its own .java file.
5.	Hours Completed (integer)
6.	GPA (double)
7.	The name and path of a .jpg file containing the student’s ETSU photo (such as photos\DonBailes.jpg)
The Student class does no input or output.  It should have standard functionality such as constructors, getters/setters, and a toString method that formats a Student object for possible display by another class.  An example of output a driver that uses a Student’s toString method follows  
 
The Student class may have additional methods as needed.
The Driver Class
The driver class handles all interaction between the program and the user.  
1.	The driver should display a welcome message that includes a short description of what the program does and who wrote it.  Use a JOptionPane message dialog.
2.	The driver should prompt for the user’s name, and remember it.  Use a JOptionPane input dialog.
3.	The driver should be menu-driven and give the users the opportunity to 
a.	Create a new Student object and populate its attribute values from user input.  Make this process as user-friendly as possible.
b.	Display an existing Student object in a well-formatted manner that is easy for a user of the program to understand.  If the user selects this menu choice, the program should verify that a Student object exists before trying to display it.  See the following for an example of how the program should handle this situation.
 
c.	Terminate the program.
4.	You may use the instructor’s Menu class and the associated Util class (see course web site) or you may create your own.
5.	When the user indicates it is time to terminate the program, display a goodbye/thank you message that includes the user’s name (obtained in item 2 above).  Use a JOptionPane message dialog.
Other Requirements
Use good object-oriented principles and style.  
•	All class attributes (fields) must be private unless there are explicit instructions to the contrary.
•	All classes in this assignment must be public.
•	Use standard Java naming conventions for packages, classes, attributes, local variables, constants, and methods.
•	The Student and driver classes and the Classification enumeration for this project must be in a package named rollManager.  It is not necessary to move other classes to this package, but it will be necessary to import any package you use that is not part of the rollManager package.  The finished project should look similar to the following in Eclipse.
 
•	Set up and use Eclipse as described in the first lab session of this course.
Project Documentation (via Comments)
Project documentation is NOT optional in this course.  It is absolutely required in every programming assignment.  See the Documentation Standards on the course website for details and for examples of proper documentation.
An otherwise perfect project may still receive a failing grade if the required documentation is missing, incomplete, or poorly done.  Examples of proper documentation appear in the course Documentation Standards document, and Eclipse will help write much of the documentation for you if you set it up and use it as described in the first lab meeting of this course.
Submission
If you navigate in Windows Explorer to your Project 1 – Student folder in your Eclipse workspace, the src subfolder should contain two subfolders named rollManager and util.  Zip both of these subfolders along with the final (updated) design document into a single zipped file named as specified in the Course Facts on the course website.  The zipped file should contain nothing other than the final design document, the rollManager and util folders, and their contents.  Submit the one zipped file to your instructor and your TA as an email attachment.  When the zipped file is opened in a program such as 7-zip, it should look something like this:
 
where the two folders contain their respective .java files.
Turn in an initial design first (see web site for due date).  See the website for instructions and an example.  Then, complete the implementation of the project and turn in an updated (final) design that includes any changes you needed to make in your design during the implementation phase.  Turn in the final design with your final java code as shown above.
