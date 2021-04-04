public class EmpWageBuilder {
	 private static final int fullTime=1;
	 private static final int partTime=0;
	 
	public static void main ( String[] args ) {
		String company;
		EmpWageBuilder c1= new EmpWageBuilder();
		c1.EmpWageBuilder("dmart",25,100,20);
		c1.EmpWageBuilder("bigbazar",20,150,30);
		c1.EmpWageBuilder("reliance mart",30,80,50);
		
	}
	public void EmpWageBuilder(String company,int numWorkingDays,int maxHoursInMonth,int empRatePerHours ) {
		
		
		int totalWorkinDays=0;
		int totalSalary=0;
		int totalEmpHours=0;
		int empWorkingHour=0;
		int totalWorkingDays=0;
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
		System.out.println("total salery for "+company+ " is "+totalSalary);
	}
}