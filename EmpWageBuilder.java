
public class EmpWageBuilder {
	
	public static void emp(double x) {
		//condition check employee present or not
		if (x==1) {
			System.out.println("employee is present");
		}else {
			System.out.println("employee is absent");
		}
	}

	public static void main ( String[] args ) {
		
		// take random numbers 1 or 0
		double empCheck = Math.floor(Math.random()*10)%2 ;
		
		//method call
		emp(empCheck);
	}
	
	
}
