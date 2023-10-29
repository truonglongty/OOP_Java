package Module3.hoadontiendien;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.text.NumberFormatter;

public abstract class KhachHang {
	protected String maKH, hoTen;
	protected Calendar ngayLapHD;
	protected double soKW;
	protected double donGia;
	
	public KhachHang() {
		super();
	}

	public KhachHang(String maKH, String hoTen, Calendar ngayLapHD, double soKW, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLapHD = ngayLapHD;
		this.soKW = soKW;
		this.donGia = donGia;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Calendar getNgayLapHD() {
		return ngayLapHD;
	}

	public void setNgayLapHD(Calendar ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	public double getSoKW() {
		return soKW;
	}

	public void setSoKW(double soKW) {
		this.soKW = soKW;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public  abstract double thanhTien();
	
	@Override
	public String toString() {
		Locale lc = new Locale("vi","VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		DateFormat df = DateFormat.getDateInstance(1,lc);
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", ngayLapHD=" + df.format(getNgayLapHD().getTime()) + ", soKW=" + soKW
				+ ", donGia=" + donGia + "]"; 
	}
	
}
