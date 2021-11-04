import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MakeGPA
	{
		
	public static double calculateGpa(String a, String b)
		{
		
		
		for(int i = 0; i < RunSIS.listOfStudents.size(); i++) {
			
			double classOne = 0.0;
			double classTwo = 0.0;
			double classThree = 0.0;
			
			switch(a)
				{
				case "A+":
					classOne = 4.00;
					break;	
				case "A":
					classOne = 4.00;
					break;
				case "A-":
					classOne = 3.69;
					break;
				case "B+":
					classOne = 3.33;
					break;
				case "B":
					classOne = 3.00;
					break;
				case "B-":
					classOne = 2.67;
					break;
				case "C+":
					classOne = 2.33;
					break;
				case "C":
					classOne = 2.00;
					break;
				case "C-":
					classOne = 1.67;
					break;
				case "D+":
					classOne = 1.33;
					break;
				case "D":
					classOne = 1.00;
					break;
				case "D-":
					classOne = 0.67;
					break;
				default:
					classOne = 0.00;
					break;
				}
			
			switch(b)
			{
			case "A+":
				classTwo = 4.00;
				break;
			case "A":
				classTwo = 4.00;
				break;
			case "A-":
				classTwo = 3.69;
				break;
			case "B+":
				classTwo = 3.33;
				break;
			case "B":
				classTwo = 3.00;
				break;
			case "B-":
				classTwo = 2.67;
				break;
			case "C+":
				classTwo = 2.33;
				break;
			case "C":
				classTwo = 2.00;
				break;
			case "C-":
				classTwo = 1.67;
				break;
			case "D+":
				classTwo = 1.33;
				break;
			case "D":
				classTwo = 1.00;
				break;
			case "D-":
				classTwo = 0.67;
				break;
			default:
				classTwo = 0.00;
				break;
			}
			
			
			switch(c)
			{
			case "A+":
				classThree = 4.00;
				break;
			case "A":
				classThree = 4.00;
				break;
			case "A-":
				classThree = 3.69;
				break;
			case "B+":
				classThree = 3.33;
				break;
			case "B":
				classThree = 3.00;
				break;
			case "B-":
				classThree = 2.67;
				break;
			case "C+":
				classThree = 2.33;
				break;
			case "C":
				classThree = 2.00;
				break;
			case "C-":
				classThree = 1.67;
				break;
			case "D+":
				classThree = 1.33;
				break;
			case "D":
				classThree = 1.00;
				break;
			case "D-":
				classThree = 0.67;
				break;
			default:
				classThree = 0.00;
				break;
			}
			
			
			
			double cumGpa = (classOne + classTwo + classThree) / 3;
			
			return cumGpa;
			
			
			
			}

		}
	}
