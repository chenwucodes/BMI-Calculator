package w23;

import java.util.Calendar;


/**
 * This system maintains important health information about a patient.
 * Note: This class assumes values passed to the set methods are correct.
 * 
 * @see Patient
 * @author Chen Wu
 * @version 1.0
 */
public class Patient{
	/**
	 * private data member first name
	 */
	private String firstName;
	/**
	 * private data member last name
	 */
	private String lastName;
	/**
	 * private data member gender
	 */
	private String gender;
	/**
	 * private data member year of birth 
	 */
	private int birthYear;
	/**
	 * private data member month of birth 
	 */
	private int birthMonth;
	/**
	 * private data member day of birth 
	 */
	private int birthDay;
	/**
	 * private data member height
	 */
	private double height;
	/**
	 * private data member weight
	 */
	private double weight;
	
	/**
	   * Constructor to initialize the patient's details.
	   * 
	   * @param firstName The first name of the patient.
	   * @param lastName The last name of the patient.
	   * @param gender The gender of the patient.
	   * @param birthYear The year of birth of the patient.
	   * @param birthMonth The month of birth of the patient.
	   * @param birthDay The day of birth of the patient.
	   * @param height The height of the patient in inches.
	   * @param weight The weight of the patient in pounds.
	   */
	public Patient(String firstName,String lastName,String gender,int birthYear,int birthMonth,int birthDay,double height,double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.height = height;
		this.weight = weight;
	}

	/**
	   * Gets the first name of the patient.
	   * @return The first name of the patient.
	   */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	   * Sets the first name of the patient.
	   * @param firstName The first name of the patient.
	   */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	   * Gets the last name of the patient.
	   * @return The last name of the patient.
	   */
	public String getLastName() {
		return lastName;
	}
	
	/**
	   * Sets the last name of the patient.
	   * @param lastName The last name of the patient.
	   */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	   * Gets the gender of the patient.
	   * @return The gender of the patient.
	   */
	public String getGender() {
		return gender;
	}
	
	/**
	   * Sets the gender of the patient.
	   * @param gender The gender of the patient.
	   */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	   * Gets the year of birth of the patient.
	   * @return The year of birth of the patient.
	   */
	public int getBirthYear() {
		return birthYear;
	}
	
	/**
	   * Sets the year of birth of the patient.
	   * @param birthYear The year of birth of the patient.
	   */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	   * Gets the month of birth of the patient.
	   * @return The month of birth of the patient.
	   */
	public int getBirthMonth() {
		return birthMonth;
	}
	
	/**
	   * Sets the month of birth of the patient.
	   * @param birthMonth The month of birth of the patient.
	   */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	
	/**
	   * Gets the day of birth of the patient.
	   * @return The day of birth of the patient.
	   */
	public int getBirthDay() {
		return birthDay;
	}
	
	/**
	   * Sets the day of birth of the patient.
	   * @param birthDay The day of birth of the patient.
	   */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	/**
	   * Gets height of the patient.
	   * @return The height of the patient.
	   */
	public double getHeight() {
		return height;
	}
	
	/**
	   * Sets height of the patient. 
	   * @param height The height of the patient.
	   */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	   * Gets weight of the patient.
	   * @return The weight of the patient.
	   */
	public double getWeight() {
		return weight;
	}
	
	/**
	   * Sets weight of the patient.
	   * @param weight The weight of the patient.
	   */
	public void setWeight(double weight) {
		this.weight = weight;
	} 

	/**
	   * Gets the Body Mass Index (BMI) of the patient.
	   * @return The BMI of the patient.
	   */
	public double getBMI() {
		   return (getWeight() * 703) / (getHeight() * getHeight());
		} 
	
	/**
	   * Calculates the age of the patient in years.
	   * @return The age of the patient in years.
	   */
	public int calculateAge() {
		Calendar now = Calendar.getInstance();
	    int currentYear = now.get(Calendar.YEAR);
	    int age = currentYear - birthYear;
		return age;
	}
	
	 /**
	   * Calculates the maximum heart rate of the patient.
	   * @return The maximum heart rate of the patient.
	   */
	public int calculateMaximumHeartRate() {
	    return 220 - calculateAge();
	}
	
	/**
	   * Calculates the minimum target heart rate of the patient.
	   * @return The minimum target heart rate of the patient.
	   */

	public int calculateMinimumTargetHeartRate() {
	    return  (int) (calculateMaximumHeartRate() * 0.5);
	}
	
	/**
	 * Calculates the maximum target heart rate for a patient.
	 * @return The maximum target heart rate of the patient.
	 */
	public int calculateMaximumTargetHeartRate() {
	    return  (int) (calculateMaximumHeartRate() * 0.85);
	}

	/**
	 * Displays all the patient's health data.
	 * The BMI values and their corresponding categories are also displayed.
	 */
	public void displayMyHealthData() { 

		System.out.printf("\nPatient Health Data\n");
		System.out.printf("First Name: %s\n", firstName);
	    System.out.printf("Last Name: %s\n", lastName);
	    System.out.printf("Gender: %s\n", gender);
	    System.out.printf("Year of Birth: %d\n", birthYear);
	    System.out.printf("Month of Birth: %d\n", birthMonth);
	    System.out.printf("Day of Birth: %d\n", birthDay);
	    System.out.printf("Height: %.2f inches\n", height);
	    System.out.printf("Weight: %.2f pounds\n", weight);
	    System.out.printf("Age: %d years\n", calculateAge());
	    System.out.printf("BMI: %.2f\n", getBMI());
	    System.out.printf("Maximum Heart Rate: %d\n", calculateMaximumHeartRate());
	    System.out.printf("Target Heart Rate Range: %d-%d\n\n", calculateMinimumTargetHeartRate(), calculateMaximumTargetHeartRate());
	 

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	}


	} 





