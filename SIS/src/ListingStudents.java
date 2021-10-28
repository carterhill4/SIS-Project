
public class ListingStudents {

	public static void listingStudent()
	{
	for(int i=0; i < RunSIS.listOfStudents.size(); i++)
		{
		System.out.println(RunSIS.listOfStudents.get(i).getFirstName() + " " + RunSIS.listOfStudents.get(i).getLastName() + " " + RunSIS.listOfStudents.get(i).getGpa());

		}
	}
	
}
