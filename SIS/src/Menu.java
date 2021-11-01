import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {

	public static void whatWouldYouDo() throws IOException {
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("What would you like to do? \n	(1) Add or delete a student \n	(2) Change student grades/schedule \n	(3) Sort students");
		int chooseMenu = userInput1.nextInt();
		
		switch(chooseMenu) {
		
		case 1:
			deleteOrAdd();
			break;
		case 2:
			changeGradesorSchedule();
			break;
		case 3:
			sortStudents();
			break;
		}
		
	}
	
	public static void deleteOrAdd() throws IOException {
			
			Scanner userInput1 = new Scanner(System.in);
			System.out.println("Add or Delete a student? \n	(1) Add a student \n	(2) Delete a student");
			int deleteOrAdd = userInput1.nextInt();
			
			switch(deleteOrAdd) {
			
			case 1:
				AddingStudent.AddingStudents();
				break;
			case 2:
				DeletingStudent.DeletingStudent();
				break;
			}
			
		}
	
	public static void changeGradesorSchedule() throws IOException {
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Change Student Grades or Schedule? \n	(1) Change Grades  \n	(2) Switch Schedule");
		int changeStudentorGrades = userInput1.nextInt();
		
		switch(changeStudentorGrades) {
		
		case 1:
				{
					ChangeGrade.changeGrades();
					break;
				}
			
		case 2:
				{
					//ChangeStudentSchedule.css();
					break;	
				}
		}
	}
	
	public static void sortStudents() throws IOException {
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Sort Students \n	(1) Sort by last name \n	(2) Sort by GPA \n	(3) Sort by period");
		int sorting = userInput1.nextInt();
		
		switch(sorting) {
		
		case 1:
			Collections.sort(RunSIS.listOfStudents, new LastnameSorter());
			break;
		case 2:
			break;
		case 3:
			break;
		}
		
	}
	

}
