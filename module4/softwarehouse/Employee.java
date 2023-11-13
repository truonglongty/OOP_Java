package module4.softwarehouse;

import java.text.DecimalFormat;
import java.util.Objects;

public abstract class Employee {
	protected int thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	
	public Employee() {}
	public Employee(int thePayrollNumber, String theName, double theBasicMonthlySalary) throws Exception {
		setThePayrollNumber(thePayrollNumber);
		setTheName(theName);
		setTheBasicMonthlySalary(theBasicMonthlySalary);
		
	}

	public int getThePayrollNumber() {
		return thePayrollNumber;
	}

	public void setThePayrollNumber(int thePayrollNumber) throws Exception {
		if(thePayrollNumber != 0)
			this.thePayrollNumber = thePayrollNumber;
		else
			throw new Exception("Error. thePayrollNumber is not null");
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}

	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}
	
	public abstract double getMonthlySalary();
	
//	@Override
//	public String toString() {
//		return "Employee [thePayrollNumber=" + thePayrollNumber + ", theName=" + theName + ", theBasicMonthlySalary="
//				+ theBasicMonthlySalary + "]";
//	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%10d %20s %15s", thePayrollNumber, theName, df.format(theBasicMonthlySalary)+"$");
	}
	
//	public static String getTieuDe() {
//		return String.format("%10s %20s %15s", "Mã_NV", "Tên_NV", "Lương_cơ_bản");
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(thePayrollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return thePayrollNumber == other.thePayrollNumber;
	}

}
