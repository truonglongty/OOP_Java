package Module3.employees;

public class SalariedEmployee extends Employees {
	private double weeklySalary;
	
	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(String name, String sSN, double weeklySalary) {
		super(name, sSN);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double luong() {
		return weeklySalary;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee -- "+ super.toString()+" , weeklySalary: "+weeklySalary+" ,Lương: "+luong();
	}
	
}
