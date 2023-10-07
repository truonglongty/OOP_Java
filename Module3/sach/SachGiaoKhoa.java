package Module3.sach;

import java.util.Calendar;

public class SachGiaoKhoa extends Sach {
	private boolean tinhTrang; //true = moi

	public SachGiaoKhoa() {
		super();
	}
	public SachGiaoKhoa(String maSach, Calendar ngayNhap, double donGia, int soLuong, String nhaXuatBan, boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}
	
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	@Override
	public String toString() {
		return "SÁCH GIÁO KHOA -- "+super.toString()+", Tình trạng: "+tinhTrang;
	}
	
	public double tinhThanhTien() {
		if(tinhTrang == true) {
			return soLuong * donGia;
		}
		else
			return soLuong * donGia * 0.5;
	}
	
	
}
