
public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	private static int salary=0;
	private static int totalWorkingDays=20;
	static int totalSalary=0;
	
	public static void emp(double x) {
		int z=(int) x;
		//condition check employee fulltime or parttime
	switch (z) {
	case 1 :
		int empWorkingHour=8;
		salary=(empWorkingHour*empRatePerHours);
		totalSalary = totalSalary +salary;
		break;
	case 0 :
		int empWorkingHour1=4;
		salary=(empWorkingHour1*empRatePerHours);
		totalSalary = totalSalary +salary;
		break;
		
	default :
	    System.out.println("error");
	    break;
	}
	
	}

	public static void main ( String[] args ) {
		for(int day=0; day< totalWorkingDays;day++) {
		// take random numbers 1 or 0
		double empCheck = Math.floor(Math.random()*10)%2 ;
		//method call
		emp(empCheck);
		}
		System.out.println("total salary for a month = "+totalSalary);
	}
	
	
}
