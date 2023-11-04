package Module3.vihicle;

public class PassengerCar extends Vihicle{
	private int soCho;
	
	public PassengerCar() {
		super();
	}
	public PassengerCar(String tenHang, double thue, int soCho) {
		super(tenHang, thue);
		this.soCho = soCho;
	}


	@Override
	public double tinhVAT() {
		int thueDacBiet = (soCho>=5)?30:50;
		return price * (thueDacBiet/100 + 0.1 + 0.2);
	}

}
