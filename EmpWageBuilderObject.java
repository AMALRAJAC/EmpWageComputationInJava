public class EmpWageBuilderObject {
	 private static final int fullTime=1;
	 private static final int partTime=0;
	 
	 private String company;
	 private int numWorkingDays;
	 private int maxHoursInMonth;
	 private int empRatePerHours;
	 private int totalSalary;
	 
	 public EmpWageBuilderObject(String company,int numWorkingDays,int maxHoursInMonth,int empRatePerHours)
	 {
		 this.company=company;
		 this.numWorkingDays=numWorkingDays;
		 this.maxHoursInMonth=maxHoursInMonth;
		 this.empRatePerHours=empRatePerHours;
	 }
	 
	public static void main ( String[] args ) {
		String company;
		EmpWageBuilderObject dmart= new EmpWageBuilderObject("dmart",25,100,20);
		EmpWageBuilderObject bigbazar= new EmpWageBuilderObject("bigbazar",20,150,30);
		dmart.ComputeWage();
		System.out.println(dmart);
		bigbazar.ComputeWage();
		System.out.println(bigbazar);
		
	}
	public void ComputeWage() {
		
		
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
	}
	public String toString() {
		return "total employee wage for company: "+company+" is "+totalSalary;
		
	}
}