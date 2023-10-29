package Module3.hoadontiendien;

import java.util.Calendar;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;
	
	public KhachHangNuocNgoai() {
		super();
	}
	public KhachHangNuocNgoai(String maKH, String hoTen, Calendar ngayLapHD, double soKW, double donGia,
			String quocTich) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		this.quocTich = quocTich;
	}

	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	
	@Override
	public double thanhTien() {
		return soKW * donGia;
	}
	
	@Override
	public String toString() {
		return "KHÁCH HÀNG NƯỚC NGOÀI -- "+super.toString()+" , Quốc tích: "+quocTich;
	}
	
}
