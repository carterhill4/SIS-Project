
public class ListingStudents {

	public static void listingStudent()
	{
	for(int i=0; i < RunSIS.listOfStudents.size(); i++)
		{
		System.out.println(RunSIS.listOfStudents.get(i).getFirstName() + " " + RunSIS.listOfStudents.get(i).getLastName() + " " + RunSIS.listOfStudents.get(i).getGpa() + " " + RunSIS.listOfStudents.get(i).getFirstClass()  + " " + RunSIS.listOfStudents.get(i).getFirstGrade() + " " + RunSIS.listOfStudents.get(i).getSecondClass()  + " " + RunSIS.listOfStudents.get(i).getSecondGrade() + " " + RunSIS.listOfStudents.get(i).getThirdClass() + " " + RunSIS.listOfStudents.get(i).getThirdGrade());

		}
	
	}
	
}
