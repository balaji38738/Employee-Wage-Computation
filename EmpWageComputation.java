public class EmpWageComputation {

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private	final int MAX_HRS_IN_MONTH;

	public EmpWageComputation(int EMP_RATE_PER_HOUR,
							  int NUM_WORKING_DAYS,
							  int MAX_HRS_IN_MONTH) {

		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}

	//Variables
	private int totalEmpWage = 0;
					  
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation\n");
		EmpWageComputation company1 = new EmpWageComputation(20,20,100);
		EmpWageComputation2 company2 = new EmpWageComputation2(60,25,150);
		System.out.println("Employee wage of first companay");
		computeEmpWage(company1);
		System.out.println("Employee wage of second company");
		EmpWageComputation2.computeEmpWage(company2);

	}

	private void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

	//Calculates employee wage
	public static void computeEmpWage(EmpWageComputation company) {

		int empHrs = 0, empWage = 0;
		int totalWorkingDays = 0, totalEmpHrs = 0;
		int totalEmpWage = 0;

		//Computation
		while (totalEmpHrs <= company.MAX_HRS_IN_MONTH &&
		       totalWorkingDays < company.NUM_WORKING_DAYS) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			empWage = empHrs * company.EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.print("Day: " + totalWorkingDays);
			System.out.print(" | Employee hours: " + empHrs);
			System.out.println(" | Employee wage: " + empWage);
		}
		company.setTotalEmpWage(totalEmpWage);
 		System.out.println("Employee Wage for month: " + totalEmpWage + "\n");

	}

}

class EmpWageComputation2 {

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private	final int MAX_HRS_IN_MONTH;

	public EmpWageComputation2(int EMP_RATE_PER_HOUR,
							  int NUM_WORKING_DAYS,
							  int MAX_HRS_IN_MONTH) {

		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}

	//Variables
	private int totalEmpWage = 0;

	private void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

	//Calculates employee wage
	public static void computeEmpWage(EmpWageComputation2 company) {

		int empHrs = 0, empWage = 0;
		int totalWorkingDays = 0, totalEmpHrs = 0;
		int totalEmpWage = 0;

		//Computation
		while (totalEmpHrs <= company.MAX_HRS_IN_MONTH &&
		       totalWorkingDays < company.NUM_WORKING_DAYS) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			empWage = empHrs * company.EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.print("Day: " + totalWorkingDays);
			System.out.print(" | Employee hours: " + empHrs);
			System.out.println(" | Employee wage: " + empWage);
		}
		company.setTotalEmpWage(totalEmpWage);
 		System.out.println("Employee Wage for month: " + totalEmpWage + "\n");

	}

}
