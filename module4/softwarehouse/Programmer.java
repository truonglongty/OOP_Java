package module4.softwarehouse;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

import Module3.hanghoa.HangHoa;

public class Programmer extends Employee {
	private String theLanguage;
	
	public Programmer() {
		super();
	}
	public Programmer(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage)
			throws Exception {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theLanguage = theLanguage;
	}

	public String getTheLanguage() {
		return theLanguage;
	}
	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}
	
	@Override
	public double getMonthlySalary() {
		if(theLanguage.equalsIgnoreCase("Java"))
			return theBasicMonthlySalary * 1.2;
		else
			return theBasicMonthlySalary;
	}
	
//	@Override
//	public String toString() {
//		return super.toString()+"Programmer [theLanguage=" + theLanguage + ", getMonthlySalary()=" + getMonthlySalary() + "]";
//	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		return String.format("%s	%-8s %-15s",super.toString(),theLanguage,df.format(getMonthlySalary())+"$");
		
	}
	
}
