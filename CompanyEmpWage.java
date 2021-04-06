public class CompanyEmpWage{
	  private String company;
	  public static int numWorkingDays;
	  public static int maxHoursInMonth;
	  public static int empRatePerHours;
	  public static int totalEmpWage;
	 
	public CompanyEmpWage( String company,int empRatePerHours,int numWorkingDays,int maxHoursInMonth) {
		
		this.company=company;
		 this.numWorkingDays=numWorkingDays;
		 this.maxHoursInMonth=maxHoursInMonth;
		 this.empRatePerHours=empRatePerHours;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}
	@Override
	public String toString() {
		return "total employee wage for company: "+company+" is "+totalEmpWage;
		
	}
}