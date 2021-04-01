public class EmpWageBuilder {
	
	
	private static int empRatePerHours=20;
	static int totalWorkingDays=0;
	static int totalSalary=0;
	static int totalEmpHours=0;
	private static int numWorkingDays=20;
	private static int maxHoursInMonth=100;
	private static int empWorkingHour=0;
	 private static final int fullTime=1;
	 private static final int partTime=0;

	public static void main ( String[] args ) {

		while (totalEmpHours<maxHoursInMonth && totalWorkingDays<numWorkingDays) {
				totalWorkingDays++;
				int empCheck =(int) Math.floor(Math.random()*10)%3 ;
				
				empWage(empCheck);
		
		}
	
		totalSalary = totalEmpHours *empRatePerHours;
		System.out.println("total salary for a month = "+totalSalary);
	
	}
	public static void empWage(int x) {
		
		switch (x) {
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
		


		totalEmpHours=totalEmpHours+empWorkingHour;
		
	}
}