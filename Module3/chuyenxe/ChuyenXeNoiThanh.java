package Module3.chuyenxe;

public class ChuyenXeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private double soKm;
	
	public ChuyenXeNoiThanh() {
		super();
		this.soTuyen = 0;
		this.soKm = 0;
	}
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTX, String soXe, double doanhThu ,int soTuyen, double soKm) {
		super(hoTenTX, hoTenTX, hoTenTX, doanhThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKm() {
		return soKm;
	}

	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}
	
	@Override
	public String toString() {
		return "CHUYẾN XE NỘI THÀNH -- "+super.toString()+", Số tuyến: "+soTuyen+", Số km đi được: "+soKm;
	}
	
	
}