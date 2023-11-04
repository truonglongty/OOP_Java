package Module3.vihicle;

public class Motorcycle extends Vihicle{	
	public Motorcycle() {
		super();
	}
	public Motorcycle(String tenHang, double price) {
		super(tenHang, price);
	}
	
	@Override
	public double tinhVAT() {
		return price * 0.1 + price * 0;
	}

}
