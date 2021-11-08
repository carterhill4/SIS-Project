import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DeletingStudent
	{

	public static void DeletingStudent() throws IOException
		{
		System.out.println(" ");
		int index = 1;
		
		//display students
		for (Student s: RunSIS.listOfStudents)
			{
				System.out.println(index + ")  " + s.getFirstName() + " " + s.getLastName());
				index++;
			}
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which number of student would you like to delete?");
		int deletedStudent = userIntInput.nextInt()-1;
		RunSIS.listOfStudents.remove(deletedStudent);
		
		//restart with changes
		ListingStudents.listingStudent();
		Menu.whatWouldYouDo();
		}

	}
