import java.util.Scanner;

public class DeletingStudent
	{
	public static void listingStudent()
		{
		for(int i=0; i<25; i++)
			{
			//uncomment this after push today. dont have the arraylist
			System.out.println(Student.listOfStudents.get(i));
			}
		}
	public static void DeletingStudent()
		{
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Which number of student would you like to delete?");
		int deletedStudent = userIntInput.nextLine();
		Student.listOfStudents.remove(deletedStudent);
		}

	}
