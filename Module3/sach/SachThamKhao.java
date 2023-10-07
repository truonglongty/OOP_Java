package Module3.sach;

import java.util.Calendar;

public class SachThamKhao extends Sach {
	private double thue;
	
	public SachThamKhao() {
		super();
	}
	public SachThamKhao(String maSach, Calendar ngayNhap, double donGia, int soLuong, String nhaXuatBan,double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
	
	@Override
	public String toString() {
		return "SÁCH THAM KHẢO -- "+super.toString()+", Thuế: "+thue;
	}
	
	public double tinhThanhTien() {
		return soLuong * donGia + thue;
	}
}
