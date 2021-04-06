
public class EmpWageBUilderArray {
	 private static final int fullTime=1;
	 private static final int partTime=0;
	 private int numOfCompany=0;
	 private CompanyEmpWage[] companyEmpWageArray;
	 public EmpWageBUilderArray() {
		 companyEmpWageArray=new CompanyEmpWage[5];
	 }
	 private void addCompanyEmpWage(String company,int empRatePerHours,int numWorkingDays,int maxHoursInMonth) {
		
		 companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHours,numWorkingDays,maxHoursInMonth);
		 numOfCompany++;
	 }
	 private void computeEmpWage(){
		 for(int i=0;i<numOfCompany;i++) {
			 companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			 System.out.println(companyEmpWageArray[i]);
		 }
		 
	 }
		private int computeEmpWage(CompanyEmpWage companyEmpWage) {
			
			
			int totalEmpHours=0;
			int empWorkingHour=0;
			int totalWorkingDays=0;
			while (totalEmpHours<CompanyEmpWage.maxHoursInMonth && totalWorkingDays<companyEmpWage.numWorkingDays) {
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
			
			return totalEmpHours *companyEmpWage.empRatePerHours;
		}
		public static void main ( String[] args ) {
			EmpWageBUilderArray empWageBuilder= new EmpWageBUilderArray();
			empWageBuilder.addCompanyEmpWage("dmart",20,2,10);
			empWageBuilder.addCompanyEmpWage("reliance",20,4,10);
			empWageBuilder.computeEmpWage();
}
		}
