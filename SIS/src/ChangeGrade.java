import java.util.Scanner;
public class ChangeGrade
	{
		public static void changeGrades()
		{
		Scanner tanner = new Scanner(System.in);
		
		System.out.println("Which student's grade would you like to change?");
		
		int index = 1;
		
		for (Student s: RunSIS.listOfStudents)
			{
				System.out.println(index + ")  " + s.getFirstName() + " " + s.getLastName());
				index++;
			}
		
		String studentChoice = tanner.nextLine();
		
		
		
	}
}