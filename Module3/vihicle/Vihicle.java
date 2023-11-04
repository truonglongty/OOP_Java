package Module3.vihicle;

public abstract class Vihicle {
	protected String tenHang;
	protected double price;
	
	public Vihicle() {}
	public Vihicle(String tenHang, double price) {
		this.tenHang = tenHang;
		this.price = price;
	}
	
	public String getTenXe() {
		return tenHang;
	}
	public void setTenXe(String tenXe) {
		this.tenHang = tenXe;
	}
	public double getThue() {
		return price;
	}
	public void setThue(double price) {
		this.price = price;
	}
	
	public abstract double tinhVAT();
	@Override
	public String toString() {
		return "Xe [tenXe=" + tenHang + ", price=" + price + "]";
	}
	
	
	
}
