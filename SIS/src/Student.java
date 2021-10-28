
public class Student
{
	//broken
	private String firstName;
	private String lastName;
	private double gpa;
	private String firstClass;
	private String secondClass;
	private String thirdClass;
	private String firstGrade;
	private String secondGrade;
	private String thirdGrade;
	public Student(String fn, String ln, double g, String fc, String sc, String tc, String fg, String sg, String tg)
	{
		firstName = fn;
		lastName = ln;
		gpa = g;
		firstClass = fn;
		secondClass = sc;
		thirdClass=tc;
		firstClass = fg;
		secondGrade = sg;
		thirdGrade =tg;
		}
	public String getFirstName()
		{
			return firstName;
		}
	public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}
	public String getLastName()
		{
			return lastName;
		}
	public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
	public double getGpa()
		{
			return gpa;
		}
	public void setGpa(double gpa)
		{
			this.gpa = gpa;
		}
	public String getFirstClass()
		{
			return firstClass;
		}
	public void setFirstClass(String firstClass)
		{
			this.firstClass = firstClass;
		}
	public String getSecondClass()
		{
			return secondClass;
		}
	public void setSecondClass(String secondClass)
		{
			this.secondClass = secondClass;
		}
	public String getThirdClass()
		{
			return thirdClass;
		}
	public void setThirdClass(String thirdClass)
		{
			this.thirdClass = thirdClass;
		}
	public String getFirstGrade()
		{
			return firstGrade;
		}
	public void setFirstGrade(String firstGrade)
		{
			this.firstGrade = firstGrade;
		}
	public String getSecondGrade()
		{
			return secondGrade;
		}
	public void setSecondGrade(String secondGrade)
		{
			this.secondGrade = secondGrade;
		}
	public String getThirdGrade()
		{
			return thirdGrade;
		}
	public void setThirdGrade(String thirdGrade)
		{
			this.thirdGrade = thirdGrade;
		}
	}
