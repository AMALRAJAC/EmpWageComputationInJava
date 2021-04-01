public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	static int empWorkingHour=0;
	static int salary=0;
	 private static final int isPresent=1;

	public static void main ( String[] args ) {

				int empCheck =(int) Math.floor(Math.random()*10)%3 ;
	
						if( isPresent ==empCheck) {
							empWorkingHour=8;
						}
						else {
						    empWorkingHour=0;
						}
						
	
						salary=empWorkingHour*empRatePerHours;
						System.out.println("salary= "+salary);
	}
}
