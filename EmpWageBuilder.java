
public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	private static int isFullTime=1;
	private static int salary=0;
	
	public static void emp(double x) {
		
		
		//condition check employee fulltime or parttime
		if (x==isFullTime) {
			System.out.println("employee is full time");
			int empWorkingHours=8;
			salary=( empWorkingHours  * empRatePerHours);
		}else {
			System.out.println("employee is parttime");
			int empWorkingHours=4;
			salary=( empWorkingHours  * empRatePerHours);
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
