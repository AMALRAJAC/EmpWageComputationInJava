
public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	static int totalWorkingDays=20;
	static int empWorkingHour=0;
	static int totalSalary=0;
	static int salary=0;
	 private static final int fullTime=2;
	 private static final int partTime=1;

	public static void main ( String[] args ) {

		for (int day=0; day< totalWorkingDays;day++) {
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
						totalSalary = totalSalary +salary;
						
		}
		System.out.println("total salary for a month = "+totalSalary);
	}
}
