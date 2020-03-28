public class EmpWageComputation {

	//CONSTANTS
	public static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");

		//Variables
		int empHrs = 0, empWage = 0;

		//Computation
		int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;
		switch(empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee wage: "+empWage);
 
	}

}