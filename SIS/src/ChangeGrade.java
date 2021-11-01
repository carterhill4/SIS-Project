import java.util.Scanner;
public class ChangeGrade
	{
		public static void changeGrades()
		{
		Scanner tanner = new Scanner(System.in);
		
		int index = 1;
		
		System.out.println("Which student's grade would you like to change?");
		
		for (Student s: RunSIS.listOfStudents)
			{
				System.out.println(index + ")  " + s.getFirstName() + " " + s.getLastName());
				index++;
			}
		
		String studentChoice = tanner.nextLine();
		
		for (Student n: RunSIS.listOfStudents)
			{
				System.out.println(n.getFirstGrade() + n.getSecondGrade());
			}
	
	}
}