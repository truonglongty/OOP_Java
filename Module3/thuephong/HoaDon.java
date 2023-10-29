package Module3.thuephong;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public abstract class HoaDon {
	protected String maHD;
	protected LocalDate ngayHD;
	protected String tenKH;
	protected String maPhong;
	protected double donGia;
	
	public HoaDon() {}
	public HoaDon(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia) {
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.tenKH = tenKH;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public LocalDate getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(LocalDate ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public abstract double thanhTien();
	
	@Override
	public String toString() {
		Locale lc = new Locale("vi","VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		DateFormat df = DateFormat.getDateInstance(1,lc);
		return "HoaDon [maHD=" + maHD + ", ngayHD=" + df.format(ngayHD) + ", tenKH=" + tenKH + ", maPhong=" + maPhong + ", donGia="+ donGia + "]"; 
	}
	
	
}
