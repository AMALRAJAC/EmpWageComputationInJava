
public class EmpWageBuilder {
	
	static int empRatePerHour = 20;
	static int empWorkingHours = 8;
	static int salary=0;
	
	public static void emp(double x) {
		//condition check employee present or not
		if (x==1) {
			System.out.println("employee is present");
			salary = ( empRatePerHour * empWorkingHours);
			System.out.println("daily wage = " +salary);
		}else {
			System.out.println("employee is absent");
			salary=0;
			System.out.println("daily wage = " +salary);
		}
	}

	public static void main ( String[] args ) {
		
		// take random numbers 1 or 0
		double empCheck = Math.floor(Math.random()*10)%2 ;
		
		//method call
		emp(empCheck);
	}
	
	
}
