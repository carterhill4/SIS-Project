import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
public class ChangeGrade
	{
		public static void changeGrades() throws IOException {
		
			Scanner tannerInt = new Scanner(System.in);
			Scanner tannerString = new Scanner(System.in);
		
			System.out.println("Which student's grade would you like to change?");
		
			
			int index = 1;
		
			//display students
			for (Student s: RunSIS.listOfStudents)
				{
					System.out.println(index + ")  " + s.getFirstName() + " " + s.getLastName());
					index++;
				}
		
		int studentChoice = tannerInt.nextInt();
		
	//display classes	
	System.out.println("Do you want to change " +  
	RunSIS.listOfStudents.get(studentChoice - 1).getFirstName() + "'s grade for " + 
	RunSIS.listOfStudents.get(studentChoice - 1).getFirstClass() + " or " + 
	RunSIS.listOfStudents.get(studentChoice - 1).getSecondClass() + " or " + 
	RunSIS.listOfStudents.get(studentChoice - 1).getThirdClass());
	
	System.out.println("Return to main menu. (type 'menu')");
	
	String classChoice = tannerString.nextLine();
	
	if(classChoice.equals(RunSIS.listOfStudents.get(studentChoice - 1).getFirstClass()))
		{
	System.out.println("What do you want to change their " + 
		RunSIS.listOfStudents.get(studentChoice - 1).getFirstClass() + " grade to?");
		}
	
	else if(classChoice.equals(RunSIS.listOfStudents.get(studentChoice - 1).getSecondClass()))
		{
	System.out.println("What do you want to change their " + 
		RunSIS.listOfStudents.get(studentChoice - 1).getSecondClass() + " grade to?");
		}
	
	else if(classChoice.equals("menu")) 
		{
		Menu.whatWouldYouDo();
		}
	
	else
		{
			System.out.println("What do you want to change their " + 
					RunSIS.listOfStudents.get(studentChoice - 1).getThirdClass() + " grade to?");
		}
	
	String gradeChange = tannerString.nextLine();
	
	// new grade
	if(classChoice.equals(RunSIS.listOfStudents.get(studentChoice - 1).getFirstClass()))
		{
			RunSIS.listOfStudents.get(studentChoice - 1).setFirstGrade(gradeChange);
		}
	else if(classChoice.equals(RunSIS.listOfStudents.get(studentChoice - 1).getSecondClass()))
		{
			RunSIS.listOfStudents.get(studentChoice - 1).setSecondGrade(gradeChange);
		}
	else if(classChoice.equals("menu")) 
		{
		Menu.whatWouldYouDo();
		}
	else
		{
			RunSIS.listOfStudents.get(studentChoice - 1).setThirdGrade(gradeChange);
		}
	System.out.println("Their new grade is a " + gradeChange);
		
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	ListingStudents.listingStudent();
		Menu.whatWouldYouDo();
	}
}