import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AddingStudent {

	public static void AddingStudents() throws IOException {
		
		MakeGPA.fillRoster();
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
		System.out.println("What is their first class? "
				+ "\n	(1) Algebra" + "\n	(2) Biology" + "\n	(3) English");
		String firstClass = userInput4.nextLine();
		
		switch(firstClass) {
			case "1":
				firstClass = "Algebra";
				break;
			case "2":
				firstClass = "Biology";
				break;
			case "3":
				firstClass = "English";
				break;
		}
		
		System.out.println(" ");
		Scanner userInput5 = new Scanner(System.in);
		System.out.println("What is their second class?"
				+ "\n	(1) Algebra" + "\n	(2) Biology" + "\n	(3) English");
		String secondClass = userInput5.nextLine();
		
		switch(secondClass) {
		case "1":
			secondClass = "Algebra";
			break;
		case "2":
			secondClass = "Biology";
			break;
		case "3":
			secondClass = "English";
			break;
		}
		
		System.out.println(" ");
		Scanner userInput6 = new Scanner(System.in);
		System.out.println("What is their third class?"
				+ "\n	(1) Algebra" + "\n	(2) Biology" + "\n	(3) English");
		String thirdClass = userInput6.nextLine();
		
		switch(thirdClass) {
		case "1":
			thirdClass = "Algebra";
			break;
		case "2":
			thirdClass = "Biology";
			break;
		case "3":
			thirdClass = "English";
			break;
		}
		
		System.out.println(" ");
		Scanner userInput7 = new Scanner(System.in);
		System.out.println("What is their first grade?");
		String firstGrade = userInput7.nextLine();
		
		System.out.println(" ");
		Scanner userInput8 = new Scanner(System.in);
		System.out.println("What is their second grade?");
		String secondGrade = userInput8.nextLine();
		
		System.out.println(" ");
		Scanner userInput9 = new Scanner(System.in);
		System.out.println("What is their third grade?");
		String thirdGrade = userInput9.nextLine();
		
		RunSIS.listOfStudents.add(new Student (firstName, lastName, gpa, firstClass, firstGrade, secondClass, secondGrade, thirdClass, thirdGrade));
		
		ListingStudents.listingStudent();
		Menu.whatWouldYouDo();
	}
	
}
