
public class EmpWageBuilder {
	
	 private static final int isPresent=1;

	public static void main ( String[] args ) {

				int empCheck =(int) Math.floor(Math.random()*10)%2 ;
	
						if( isPresent ==empCheck) {
							System.out.println("employee is present");
						}
						else {
							System.out.println("employee is absent");
						}
	}
}
