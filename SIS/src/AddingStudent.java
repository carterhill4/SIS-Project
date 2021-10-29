import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AddingStudent {

	public static void AddingStudents() {
		
		
		ListingStudents.listingStudent();
		
		System.out.println(" ");
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is their first name?");
		String firstName = userInput.nextLine();
		
		System.out.println(" ");
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("What is their last name?");
		String lastName = userInput2.nextLine();
		
		System.out.println(" ");
		Scanner userInput3 = new Scanner(System.in);
		System.out.println("What is their gpa?");
		double gpa = userInput3.nextDouble();
		
		System.out.println(" ");
		Scanner userInput4 = new Scanner(System.in);
		System.out.println("What is their first class?");
		String firstClass = userInput4.nextLine();
		
		System.out.println(" ");
		Scanner userInput5 = new Scanner(System.in);
		System.out.println("What is their second class?");
		String secondClass = userInput5.nextLine();
		
		System.out.println(" ");
		Scanner userInput6 = new Scanner(System.in);
		System.out.println("What is their third class?");
		String thirdClass = userInput6.nextLine();
		
		System.out.println(" ");
		Scanner userInput7 = new Scanner(System.in);
		System.out.println("What is their first class?");
		String firstGrade = userInput7.nextLine();
		
		System.out.println(" ");
		Scanner userInput8 = new Scanner(System.in);
		System.out.println("What is their second class?");
		String secondGrade = userInput8.nextLine();
		
		System.out.println(" ");
		Scanner userInput9 = new Scanner(System.in);
		System.out.println("What is their third class?");
		String thirdGrade = userInput9.nextLine();
		
		RunSIS.listOfStudents.add(new Student (firstName, lastName, gpa, firstClass, secondClass, thirdClass, firstGrade, secondGrade, thirdGrade));
		
		ListingStudents.listingStudent();
		
	}
	
}
