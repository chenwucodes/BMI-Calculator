package w23;

/**
 * The MyHealthDataTest2 class tests Patient class' getBMI method.
 * Assumptions: 
 * 1. Patient's height and weight values have been set and are valid.
 * 2. getBMI() method calculates the Body Mass Index based on the formula: weight*703 / (height * height).
 * Modification:
 * testGetBMIError execution fails by introducing an error into code:
 * add 0.2 to getBMI method.
 * @author Chen Wu
 */
public class MyHealthDataTest2 {
	/**
	 * EPSILON is the acceptable error range used in the tests.
	 */
	public static final double EPSILON = 1E-2;
	
	/**
	 * The main method runs the tests.
	 * @param args Command line arguments (unused)
	 */
	public static void main(String[] args) {
		testGetBMISucess();
//		testGetBMIError();
	}

	/**
	 * testGetBMISucess creates a Patient object with specified parameters and
	 * calculates the BMI using the getBMI method. It then compares the result
	 * with the expected result within the acceptable error range defined by EPSILON.
	 * If the result is within the acceptable range, the test is considered passed.
	 * If not, the test has failed.
	 */
	public static void testGetBMISucess(){
		Patient aPatient = new Patient(null, null, null, 0, 0, 0, 65, 132);
		double result = aPatient.getBMI();
		double expectedResult = 21.96;
	
		if(Math.abs(result-expectedResult)<= EPSILON ) {
			System.out.println("The test has passed successfully.");
		}else {
			System.out.println("The test has failed.");
		}
			
	}
	
	/**
	 * testGetBMIError creates a Patient object with specified parameters and
	 * calculates the BMI using the getBMI method with an added error.
	 * It then compares the result with the expected result within the
	 * acceptable error range defined by EPSILON.
	 * If the result is within the acceptable range, the test is considered passed.
	 * If not, the test has failed.
	 */
	public static void testGetBMIError(){
		Patient aPatient = new Patient(null, null, null, 0, 0, 0, 65, 132);
		double result = aPatient.getBMI() + 0.2;
		double expectedResult = 21.96;
	
		if(Math.abs(result-expectedResult)<= EPSILON ) {
			System.out.println("The test has passed successfully.");
		}else {
			System.out.println("The test has failed.");
		}
			
	}
		
	

	}


