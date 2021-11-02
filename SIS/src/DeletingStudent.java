import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DeletingStudent
	{

	public static void DeletingStudent() throws IOException
		{
		MakeGPA.fillRoster();
		ListingStudents.listingStudent();
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which number of student would you like to delete?");
		int deletedStudent = userIntInput.nextInt()-1;
		RunSIS.listOfStudents.remove(deletedStudent);
		ListingStudents.listingStudent();
		Menu.whatWouldYouDo();
		}

	}
