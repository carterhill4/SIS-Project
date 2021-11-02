//import java.io.File;
//import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
//import java.io.IOException;

public class ChangeStudentSchedule
	{
		static Scanner userInput = new Scanner (System.in);



public static void prnStu() throws IOException
{
	
	ListingStudents.listingStudent();
	}

public static void css() throws IOException
{

	System.out.println("1.Do you want to change a student Schedule ?");
	System.out.println("2.Or do you want to return to menu");



	int intChoice = userInput.nextInt();
	if(intChoice==1) {
	System.out.println("Which student do you want to change?");
	ListingStudents.listingStudent();
	int studentChoice= userInput.nextInt()-1;
	System.out.println(RunSIS.listOfStudents.get(studentChoice).getFirstName() +" " + RunSIS.listOfStudents.get(studentChoice).getLastName());
	System.out.println("1st " + RunSIS.listOfStudents.get(studentChoice).getFirstClass());	
	System.out.println("2nd " + RunSIS.listOfStudents.get(studentChoice).getSecondClass());	
	System.out.println("3rd " + RunSIS.listOfStudents.get(studentChoice).getThirdClass());
	System.out.println("which class do you want to change");
	int changeChoice= userInput.nextInt();
	switch(changeChoice)
	{
		case 1:
			{
			System.out.println("what class do you want to replace it with?");
			System.out.println("1. Algebra");
			System.out.println("2. Biology ");
			System.out.println("3. English");
			int classChoice=userInput.nextInt();
			switch(classChoice)
			{
				case 1:
					{
						RunSIS.listOfStudents.get(studentChoice).setFirstClass("Algebra");	
						System.out.println("you switched the class");
						css();
						break;
					}
				case 2:
						{
							RunSIS.listOfStudents.get(studentChoice).setFirstClass("Biology");	
							System.out.println("you switched the class");
							css();
							break;

						}
				case 3:
						{
							RunSIS.listOfStudents.get(studentChoice).setFirstClass("English");	
							System.out.println("you switched the class");
							css();	
							break;

						}
						
						
			}
			break;
			}//end iof case 1
		case 2:
				{
			System.out.println("what class do you want to replace it with?");
			System.out.println("1. Algebra");
			System.out.println("2. Biology ");
			System.out.println("3. English");
			int classChoice=userInput.nextInt();
			switch(classChoice)
			{
				case 1:
					{
						RunSIS.listOfStudents.get(studentChoice).setSecondClass("Algebra");	
						System.out.println("you switched the class");
						css();
						break;

					}
				case 2:
						{
							RunSIS.listOfStudents.get(studentChoice).setSecondClass("Biology");	
							System.out.println("you switched the class");
							css();
							break;

						}
				case 3:
						{
							RunSIS.listOfStudents.get(studentChoice).setSecondClass("English");	
							System.out.println("you switched the class");
							css();	
							break;

						}
						
						
			}
		
		
			break;
		
	}
		case 3:
				{
					System.out.println("what class do you want to replace it with?");
					System.out.println("1. Algebra");
					System.out.println("2. Biology ");
					System.out.println("3. English");
					int classChoice=userInput.nextInt();
					switch(classChoice)
					{
						case 1:
							{
								RunSIS.listOfStudents.get(studentChoice).setThirdClass("Algebra");	
								System.out.println("you switched the class");
								css();
								break;

							}
						case 2:
								{
									RunSIS.listOfStudents.get(studentChoice).setThirdClass("Biology");	
									System.out.println("you switched the class");
									css();
									break;

								}
						case 3:
								{
									RunSIS.listOfStudents.get(studentChoice).setThirdClass("English");	
									System.out.println("you switched the class");
									css();	
									break;

								}
								
								
					}
					break;
				}
		
		
		
		
		
		
		
		
	}
	}
	else if (intChoice ==2)
		{
			//Menu.whatWouldYouDo();
		}
	
}

	}
	
	



	
