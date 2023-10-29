package Module3.employees;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	public BasePlusCommissionEmployee(String name, String sSN, double grossSales, double commissionRate,
			double baseSalary) {
		super(name, sSN, grossSales, commissionRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double luong() {
		return commissionRate*grossSales + baseSalary;
	}
	
	@Override
	public String toString() {
		return "BasePlusCommissionEmployee -- "+super.toString()+" ,Lương cơ bản: "+baseSalary+" ,Lương: "+luong();
	}
	
}
