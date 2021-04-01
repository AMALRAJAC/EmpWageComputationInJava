public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	static int empWorkingHour=0;
	static int totalSalary=0;
	static int salary=0;
	 private static final int fullTime=2;
	 private static final int partTime=1;

	public static void main ( String[] args ) {

				int empCheck =(int) Math.floor(Math.random()*10)%3 ;
		
						switch (empCheck) {
						case fullTime :
							empWorkingHour=8;
							
							break;
						case partTime :
							empWorkingHour=4;
							
							break;
							
						default :
						    empWorkingHour=0;
						    break;
						}
	
						salary=empWorkingHour*empRatePerHours;
						System.out.println("salary= "+salary);
	}
}
