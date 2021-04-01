
public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	static int empWorkingHour=0;
	static int salary=0;
	 private static final int fullTime=2;
	 private static final int partTime=1;

	public static void main ( String[] args ) {

				int empCheck =(int) Math.floor(Math.random()*10)%3 ;
	
						if( fullTime ==empCheck) {
							empWorkingHour=8;
						}
						else if( partTime ==empCheck) {
							empWorkingHour=4;
						}
							
						else {
						    empWorkingHour=0;
						}
						
	
						salary=empWorkingHour*empRatePerHours;
						System.out.println("salary= "+salary);
	}
}
