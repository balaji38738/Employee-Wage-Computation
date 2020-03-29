public class EmpWageComputation {

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private static final int TOTAL_COMPANIES = 10;

	//Variables
	private static int empRatePerHour = 0, numWorkingDays = 0;
	private static int maxHrsInMonth = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation\n");

		CompanyEmpWage employee[] = new CompanyEmpWage [TOTAL_COMPANIES];
		for (int i = 0; i < TOTAL_COMPANIES; i++) {
			//Generate Employee rate between 100 to 300
			empRatePerHour = (int) (100 + Math.random() * 300);

			//Generate Employee working days between 20 to 25
			numWorkingDays = (int) (20 + Math.random() * 25);

			//Generate Employee work hours between 100 to 200
			maxHrsInMonth = (int) (100 + Math.random() * 200);
			employee[i] = new CompanyEmpWage(empRatePerHour, numWorkingDays,
											 maxHrsInMonth);
			computeEmpWage(employee[i], i);
		}

	}

	//Calculates employee wage
	public static void computeEmpWage(CompanyEmpWage employee, int empNo) {

		int empHrs = 0, empWage = 0;
		int totalWorkingDays = 0, totalEmpHrs = 0;
		int totalEmpWage = 0;

		//Computation
		while (totalEmpHrs <= employee.getMaxHrsInMonth() &&
		       totalWorkingDays < employee.getNumWorkingDays()) {
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
			empWage = empHrs * employee.getEmpRatePerHour();
			totalEmpWage += empWage;
		}
		employee.setTotalEmpWage(totalEmpWage);
 		System.out.println("Monthly Wage of employee " + (empNo + 1) + ":" + totalEmpWage);

	}

}

class CompanyEmpWage {

	//CONSTANTS
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private	final int MAX_HRS_IN_MONTH;

	//Variables
	private int totalEmpWage = 0;

	public CompanyEmpWage(int EMP_RATE_PER_HOUR,
						  int NUM_WORKING_DAYS,
						  int MAX_HRS_IN_MONTH) {

		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}

	public int getEmpRatePerHour() {

		return EMP_RATE_PER_HOUR;

	}

	public int getNumWorkingDays() {

		return NUM_WORKING_DAYS;

	}

	public int getMaxHrsInMonth() {

		return MAX_HRS_IN_MONTH;

	}

	public void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

}