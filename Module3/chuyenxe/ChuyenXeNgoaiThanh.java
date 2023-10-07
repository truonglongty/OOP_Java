package Module3.chuyenxe;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private int soNgayDiDuoc;
	
	public ChuyenXeNgoaiThanh() {
		super();
		this.noiDen = "";
		this.soNgayDiDuoc = 0;
	}
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTX, String soXe, double doanhThu, String noiDen, int soNgayDiDuoc) {
		super(maSoChuyen, hoTenTX, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}

	@Override
	public String toString() {
		return "CHUYẾN XE NGOẠI THÀNH -- "+super.toString()+", Nơi đến: "+ noiDen+", Số ngày đi được: "+soNgayDiDuoc;
	}
	
}