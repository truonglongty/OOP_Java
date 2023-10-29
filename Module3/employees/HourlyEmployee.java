package Module3.employees;

public class HourlyEmployee extends Employees {
	private double hours, wage;
	
	public HourlyEmployee() {
		super();
	}
	public HourlyEmployee(String name, String sSN, double hours, double wage) {
		super(name, sSN);
		this.hours = hours;
		this.wage = wage;
	}


	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public double luong() {
		if(hours <= 40)
			return wage * hours;
		else
			return 40*wage + (hours-40)*wage*1.5;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee -- "+super.toString()+", số giờ: "+hours+" ,số tiền/giờ: "+wage+" ,Lương: "+luong();
	}
}
