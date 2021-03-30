
public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	private static int salary=0;
	static int totalWorkingDays=0;
	static int totalSalary=0;
	static int totalEmpHours=0;
	private static int numWorkingDays=20;
	private static int maxHoursInMonth=10;
	
	public static void emp(double x) {
		int z=(int) x;
		//condition check employee fulltime or parttime
	switch (z) {
	case 1 :
		int empWorkingHour=8;
		salary=(empWorkingHour*empRatePerHours);
		totalSalary = totalSalary +salary;
		totalEmpHours=totalEmpHours+empWorkingHour;
		break;
	case 0 :
		int empWorkingHour1=4;
		salary=(empWorkingHour1*empRatePerHours);
		totalSalary = totalSalary +salary;
		totalEmpHours=totalEmpHours+empWorkingHour1;
		break;
		
	default :
	    System.out.println("error");
	    break;
	}
	
	}

	public static void main ( String[] args ) {

		while (totalEmpHours<maxHoursInMonth && totalWorkingDays<numWorkingDays) {
			totalEmpHours++;
		// take random numbers 1 or 0
		double empCheck = Math.floor(Math.random()*10)%2 ;
		//method call
		emp(empCheck);
		}
		System.out.println("total salary for a month = "+totalSalary);
	}
	
	
}
