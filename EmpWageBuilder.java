public class EmpWageBuilder {
	static int totalWorkingDays=0;
	static int totalSalary=0;
	static int totalEmpHours=0;
	static int empWorkingHour=0;
	 private static final int fullTime=1;
	 private static final int partTime=0;

	public static void main ( String[] args ) {
		
		EmpWageBuilder c1= new EmpWageBuilder();
		c1.EmpWageBuilder(20,100,20);
		
	}
	public void EmpWageBuilder(int numWorkingDays,int maxHoursInMonth,int empRatePerHours ) {
		

		while (totalEmpHours<maxHoursInMonth && totalWorkingDays<numWorkingDays) {
			totalWorkingDays++;
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
		totalEmpHours=totalEmpHours+empWorkingHour;
		

		}
		
		totalSalary = totalEmpHours *empRatePerHours;
		System.out.println("total salary= "+totalSalary);
	}
}
