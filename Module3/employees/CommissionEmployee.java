package Module3.employees;

public class CommissionEmployee extends Employees {
	protected double grossSales;
	protected double commissionRate;
	
	public CommissionEmployee() {
		super();
	}
	public CommissionEmployee(String name, String sSN, double grossSales, double commissionRate) {
		super(name, sSN);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double luong() {
		return commissionRate * grossSales;
	}
	
	@Override
	public String toString() {
		return "CommissionEmployee -- "+super.toString()+", doanh số bán hàng: "+grossSales+", phần trăm hoa hồng: "+commissionRate+" ,Lương: "+luong();
	}

}
