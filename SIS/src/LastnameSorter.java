import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;
import java.util.Comparator;
public class LastnameSorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2){
		
			return s1.getLastName().compareTo(s2.getLastName());
			
		}
		public static void displayMenu() throws IOException 
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
			
			ListingStudents.listingStudent();
				Menu.whatWouldYouDo();
		}
	}
