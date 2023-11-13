package module4.softwarehouse;

import java.text.DecimalFormat;

import Module3.hanghoa.HangHoa;

public class Administrator extends Employee {
	private String theDepartment;
	
	public Administrator() {
		super();
	}
	public Administrator(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment)
			throws Exception {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}

	public String getTheDepartment() {
		return theDepartment;
	}
	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}
	
	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary * 1.4;
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+"Administrator [theDepartment=" + theDepartment + ", getMonthlySalary()=" + getMonthlySalary() + "]";
//	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%s	%-16s %-20s",super.toString(),theDepartment,df.format(getMonthlySalary())+"$");
	}

}
