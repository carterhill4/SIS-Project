import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DeletingStudent
	{

	public static void DeletingStudent() throws IOException
		{
		ListingStudents.listingStudent();
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which number of student would you like to delete?");
		int deletedStudent = userIntInput.nextInt();
		RunSIS.listOfStudents.remove(deletedStudent);
		}

	}
