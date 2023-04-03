package w23;

import java.util.Scanner;

/**
 * This is the driver class for the Patient class.
 * This means that it just runs the application with a method main.
 * @author Chen Wu
 */
public class MyHealthDataTest {
	
	/**
	 * This is the entry point for the application,
	 * it asks the user for their personal health data and then displays it.
	 * @param args Command line arguments (unused)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height;
		double weight;
		
		System.out.print("Enter first name ");
		firstName = input.next();
		System.out.print("Enter last name ");
		lastName = input.next();
		System.out.print("Enter gender (M/F)");
		gender = input.next();
		System.out.print("Enter year of birth ");
		birthYear = input.nextInt();
		System.out.print("Enter month of birth ");
		birthMonth = input.nextInt();
		System.out.print("Enter day of birth ");
		birthDay = input.nextInt();
		System.out.print("Enter height (inches) ");
		height = input.nextDouble();
		System.out.print("Enter weight (pounds)");
		weight = input.nextDouble();
		
		Patient patient = new Patient(firstName,lastName,gender,birthYear,birthMonth,birthDay,height,weight);
		
		patient.displayMyHealthData();
	}

	

}
