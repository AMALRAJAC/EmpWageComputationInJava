
public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	private static int isFullTime=1;
	private static int isPartTime=0;
	private static int salary=0;
	
	public static void emp(double x) {
		
		int z=(int) x;
		//condition check employee fulltime or parttime
	switch (z) {
	case 1 :
		System.out.println("employee is fulltime");
		int empWorkingHour=8;
		salary=(empWorkingHour*empRatePerHours);
		break;
	case 0 :
		System.out.println("employee is parttime");
		int empWorkingHour1=4;
		salary=(empWorkingHour1*empRatePerHours);
		break;
		
	default :
	    System.out.println("error");
	    break;
	}
		System.out.println("salary = "+salary);
	}

	public static void main ( String[] args ) {
		
		// take random numbers 1 or 0
		double empCheck = Math.floor(Math.random()*10)%2 ;
		
		//method call
		emp(empCheck);
	}
	
	
}
