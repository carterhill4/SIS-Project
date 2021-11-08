import java.util.Scanner;
import java.util.Comparator;
import java.io.IOException;
import java.util.Collections;
public class PeriodSort
{
	public static void pSort() throws IOException
	{
		Collections.sort(RunSIS.listOfStudents, new LastnameSorter());
		
		RunSIS.listOfStudents.sort(Comparator.comparing(Student::getFirstClass));	
	ListingStudents.listingStudent();	
}
}
