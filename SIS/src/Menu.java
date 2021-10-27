import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Menu {

	public static void whatWouldYouDo() {
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("What would you like to do? \n	(1) Add or delete a student \n	(2) Change student grades/schedule \n	(3) Sort students");
		int chooseMenu = userInput1.nextInt();
		
		switch(chooseMenu) {
		
		case 1:
			deleteOrAdd();
			break;
		case 2:
			changeStudentorGrades();
			break;
		case 3:
			sortStudents();
			break;
		}
		
	}
	
	public static void deleteOrAdd() {
			
			Scanner userInput1 = new Scanner(System.in);
			System.out.println("Add or Delete a student? \n	(1) Add a student \n	(2) Delete a student");
			int deleteOrAdd = userInput1.nextInt();
			
			switch(deleteOrAdd) {
			
			case 1:
				break;
			case 2:
				break;
			}
			
		}
	
	public static void changeStudentorGrades() {
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Change Student Grades or Schedule? \n	(1) Change Grades  \n	(2) Switch Classes");
		int changeStudentorGrades = userInput1.nextInt();
		
		switch(changeStudentorGrades) {
		
		case 1:
			break;
		case 2:
			break;
		}
	}
	
	public static void sortStudents() {
		
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Sort Students \n	(1) Sort by last name \n	(2) Sort by GPA \n	(3) Sort by period");
		int sorting = userInput1.nextInt();
		
		switch(sorting) {
		
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
		
	}
	

}
