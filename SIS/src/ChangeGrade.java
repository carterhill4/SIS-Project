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
		
		int studentChoice = tanner.nextInt();
		
		
	System.out.println("Do you want to change" + " the grade for " + 
	RunSIS.listOfStudents.get(studentChoice - 1).getFirstClass() + " or " + 
	RunSIS.listOfStudents.get(studentChoice - 1).getSecondClass() + " or " + 
	RunSIS.listOfStudents.get(studentChoice - 1).getThirdClass());
	
	
		
	}
}