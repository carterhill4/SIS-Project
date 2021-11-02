
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;

public class RunSIS
	{

		static ArrayList <Student> listOfStudents = new ArrayList<Student>();
			
		Scanner userInput = new Scanner(System.in);
		
	public static void main(String[] args) throws IOException
		{
			
			Scanner myFile = new Scanner(new File("SISFile.txt"));
			
			while(myFile.hasNext())
				{
					String line = myFile.nextLine();
					
			String [] splitArray = line.split(" ");
						
					listOfStudents.add(new Student(splitArray [0], splitArray [1], 0, 
							splitArray [2], splitArray [3], splitArray [4], splitArray [5], splitArray [6], splitArray [7]));
				}
				System.out.println(listOfStudents.size());

				Menu.whatWouldYouDo();
				
				//Collections.sort(listOfStudents, new LastnameSorter());
		
				
		}


	
	}

