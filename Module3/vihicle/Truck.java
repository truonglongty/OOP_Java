package Module3.vihicle;

public class Truck extends Vihicle{
	
	public Truck() {
		super();
	}
	public Truck(String tenHang, double price) {
		super(tenHang, price);
	}
	
	@Override
	public double tinhVAT() {
		return price * (0.1 + 0.02);
	}

}
