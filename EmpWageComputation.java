public class EmpWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		//CONSTANTS
		int IS_FULL_TIME = 1, IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

		//Variables
		int empHrs = 0, empWage = 0;

		//Computation
		int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee wage: "+empWage);
 
	}

}