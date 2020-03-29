interface Computable {

	void computeEmpWage();

}

public class EmpWageComputation implements Computable {

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private final int TOTAL_COMPANIES;

	//Variables
	private static int empRatePerHour = 0, numWorkingDays = 0;
	private static int maxHrsInMonth = 0;
	CompanyEmpWage employee[];

	public EmpWageComputation(int totalCompanies) {

		this.TOTAL_COMPANIES = totalCompanies;
		this.employee = new CompanyEmpWage [this.TOTAL_COMPANIES];

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation\n");
		EmpWageComputation firstComp = new EmpWageComputation(20);
	
		//Generate Employee rate between 100 to 300
		empRatePerHour = (int) (100 + Math.random() * 300);

		//Generate Employee working days between 20 to 25
		numWorkingDays = (int) (20 + Math.random() * 25);

		//Generate Employee work hours between 100 to 200
		maxHrsInMonth = (int) (100 + Math.random() * 200);

		for (int i = 0; i < firstComp.employee.length; i++) {
			firstComp.employee[i] = new CompanyEmpWage(empRatePerHour,
			                        numWorkingDays, maxHrsInMonth);
		}
		firstComp.computeEmpWage();

	}

	//Calculates employee wage
	public void computeEmpWage() {

		for (int empNo = 0; empNo < employee.length; empNo++)
		{
			int empHrs = 0, empWage = 0, totalEmpWage = 0;
			int totalWorkingDays = 0, totalEmpHrs = 0;

			//Computation
			while (totalEmpHrs <= employee[empNo].getMaxHrsInMonth() &&
			       totalWorkingDays < employee[empNo].getNumWorkingDays()) {
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
				empWage = empHrs * employee[empNo].getEmpRatePerHour();
				totalEmpWage += empWage;
			}
			employee[empNo].setTotalEmpWage(totalEmpWage);
	 		System.out.println("Monthly Wage of employee " + (empNo + 1) + ":" + totalEmpWage);
	 	}

	}

}

class CompanyEmpWage {

	//CONSTANTS
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private	final int MAX_HRS_IN_MONTH;

	//Variables
	private int totalEmpWage = 0;

	public CompanyEmpWage(int empRatePerHour,
						  int numWorkingDays,
						  int maxHrsInMonth) {

		this.EMP_RATE_PER_HOUR = empRatePerHour;
		this.NUM_WORKING_DAYS = numWorkingDays;
		this.MAX_HRS_IN_MONTH = maxHrsInMonth;

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