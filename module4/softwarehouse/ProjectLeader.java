package module4.softwarehouse;

public class ProjectLeader extends Programmer {
	
	public ProjectLeader() {
		super();
	}
	public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage)
			throws Exception {
		super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
	}
	
	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary * 1.2;
	}
	
}
