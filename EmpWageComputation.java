public class EmpWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

   public static int computeEmpWage(String company, int empRate, int numOfDays, int maxHrs) {
      System.out.println("Welcome to Employee Wage Computation");
		int empHrs, empWage=0, totalWage=0, totalEmpHrs=0, totalWorkingDays=0;
		while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays) {
			totalWorkingDays++;
		int empCheck = (int)Math.floor(Math.random() * 10) %3;
		switch ((int)empCheck){
		case IS_FULL_TIME:
			System.out.println("Employee is Present on day " +totalWorkingDays);
			empHrs = 8;
		break;
		case IS_PART_TIME:
         System.out.println("Employee is Part Time Present on day " +totalWorkingDays);
         empHrs = 4;
      break;
		default:
			System.out.println("Employee is Absent on day " +totalWorkingDays);
			empHrs = 0;
		break;
		}
		empWage = empHrs * empRate;
		System.out.println("Employee Wage for that day: " +empWage);
		totalWage += empWage;
	}
	System.out.println("Total Wage for a month in company :" +company+ " is " +totalWage);
	return totalWage;
	}
	public static void main(String[] args) {
		computeEmpWage("DMart", 20, 20, 10);
		computeEmpWage("BigBasket", 20, 25, 8);
	}
}

